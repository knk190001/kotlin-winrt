package Microsoft.UI.Xaml.Interop

import Microsoft.UI.Xaml.Interop.IBindableIterable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBindableVectorView.ABI::class)
@Signature("{346dd6e7-976e-4bc3-815d-ece243bc0f33}")
@Guid("346dd6e7976e4bc3815dece243bc0f33")
@WinRTInterface("346dd6e7976e4bc3815dece243bc0f33")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindableVectorView.ByReference::class)
public interface IBindableVectorView : NativeMapped, IWinRTInterface, IBindableIterable {
  @InterfaceMethod(0)
  public fun GetAt(index: WinDef.UINT): IUnknown?

  @InterfaceMethod(1)
  public fun get_Size(): WinDef.UINT

  @InterfaceMethod(2)
  public fun IndexOf(value: IUnknown?, index: WinDef.UINT): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindableVectorView> {
    public override fun getValue() = ABI.makeIBindableVectorView(pointer.getPointer(0))

    public fun setValue(value: IBindableVectorView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindableVectorView, IBindableIterable.WithDefault {
    public val __1061593975_Ptr: Pointer?

    public val _1061593975_VtblPtr: Pointer?
      get() = __1061593975_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAt(index: WinDef.UINT): IUnknown? {
      val fnPtr = _1061593975_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1061593975_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Size(): WinDef.UINT {
      val fnPtr = _1061593975_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1061593975_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun IndexOf(value: IUnknown?, index: WinDef.UINT): Boolean {
      val fnPtr = _1061593975_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1061593975_Ptr, marshalToNative(value), index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBindableVectorView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBindableIterable {
    public override val __2104271137_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1061593975_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1061593975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindableVectorView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("346dd6e7976e4bc3815dece243bc0f33")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindableVectorView(ptr: Pointer?): WithDefault = IBindableVectorView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindableVectorView {
      val address = segment.toRawLongValue()
      return makeIBindableVectorView(Pointer(address))
    }

    public override fun toNative(obj: IBindableVectorView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1061593975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindableVectorView): Array<IBindableVectorView?> =
        (elements as
        Array<IBindableVectorView?>).castToImpl<IBindableVectorView,IBindableVectorView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindableVectorView?> =
        arrayOfNulls<IBindableVectorView_Impl>(size) as Array<IBindableVectorView?>
  }
}
