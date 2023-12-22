package Windows.Web.AtomPub

import Windows.Foundation.Collections.IVectorView
import Windows.Web.Syndication.ISyndicationNode
import Windows.Web.Syndication.ISyndicationNode.ABI.IID
import Windows.Web.Syndication.ISyndicationText
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWorkspace.ABI::class)
@Signature("{b41da63b-a4b8-4036-89c5-83c31266ba49}")
@Guid("b41da63ba4b8403689c583c31266ba49")
@WinRTInterface("b41da63ba4b8403689c583c31266ba49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWorkspace.ByReference::class)
public interface IWorkspace : NativeMapped, IWinRTInterface, ISyndicationNode {
  @InterfaceMethod(0)
  public fun get_Title(): ISyndicationText?

  @InterfaceMethod(1)
  public fun get_Collections(): IVectorView<ResourceCollection?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWorkspace> {
    public override fun getValue() = ABI.makeIWorkspace(pointer.getPointer(0))

    public fun setValue(value: IWorkspace_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWorkspace, ISyndicationNode.WithDefault {
    public val __433176979_Ptr: Pointer?

    public val _433176979_VtblPtr: Pointer?
      get() = __433176979_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): ISyndicationText? {
      val fnPtr = _433176979_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISyndicationText>()
      val hr = fn.invokeHR(arrayOf(__433176979_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISyndicationText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Collections(): IVectorView<ResourceCollection?>? {
      val fnPtr = _433176979_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ResourceCollection?>>()
      val hr = fn.invokeHR(arrayOf(__433176979_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ResourceCollection?>>(result.getValue())
      return resultValue
    }
  }

  public class IWorkspace_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISyndicationNode {
    public override val __1576492622_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_433176979_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __433176979_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWorkspace, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b41da63ba4b8403689c583c31266ba49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWorkspace(ptr: Pointer?): WithDefault = IWorkspace_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWorkspace {
      val address = segment.toRawLongValue()
      return makeIWorkspace(Pointer(address))
    }

    public override fun toNative(obj: IWorkspace): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__433176979_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWorkspace): Array<IWorkspace?> = (elements as
        Array<IWorkspace?>).castToImpl<IWorkspace,IWorkspace_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWorkspace?> = arrayOfNulls<IWorkspace_Impl>(size)
        as Array<IWorkspace?>
  }
}
