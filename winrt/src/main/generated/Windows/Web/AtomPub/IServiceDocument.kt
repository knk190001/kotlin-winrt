package Windows.Web.AtomPub

import Windows.Foundation.Collections.IVectorView
import Windows.Web.Syndication.ISyndicationNode
import Windows.Web.Syndication.ISyndicationNode.ABI.IID
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

@ABIMarker(IServiceDocument.ABI::class)
@Signature("{8b7ec771-2ab3-4dbe-8bcc-778f92b75e51}")
@Guid("8b7ec7712ab34dbe8bcc778f92b75e51")
@WinRTInterface("8b7ec7712ab34dbe8bcc778f92b75e51")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IServiceDocument.ByReference::class)
public interface IServiceDocument : NativeMapped, IWinRTInterface, ISyndicationNode {
  @InterfaceMethod(0)
  public fun get_Workspaces(): IVectorView<Workspace?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IServiceDocument> {
    public override fun getValue() = ABI.makeIServiceDocument(pointer.getPointer(0))

    public fun setValue(value: IServiceDocument_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IServiceDocument, ISyndicationNode.WithDefault {
    public val __187766126_Ptr: Pointer?

    public val _187766126_VtblPtr: Pointer?
      get() = __187766126_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Workspaces(): IVectorView<Workspace?>? {
      val fnPtr = _187766126_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Workspace?>>()
      val hr = fn.invokeHR(arrayOf(__187766126_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Workspace?>>(result.getValue())
      return resultValue
    }
  }

  public class IServiceDocument_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISyndicationNode {
    public override val __1576492622_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_187766126_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __187766126_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IServiceDocument, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b7ec7712ab34dbe8bcc778f92b75e51")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIServiceDocument(ptr: Pointer?): WithDefault = IServiceDocument_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IServiceDocument {
      val address = segment.toRawLongValue()
      return makeIServiceDocument(Pointer(address))
    }

    public override fun toNative(obj: IServiceDocument): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__187766126_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IServiceDocument): Array<IServiceDocument?> = (elements as
        Array<IServiceDocument?>).castToImpl<IServiceDocument,IServiceDocument_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IServiceDocument?> =
        arrayOfNulls<IServiceDocument_Impl>(size) as Array<IServiceDocument?>
  }
}
