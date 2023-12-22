package Microsoft.UI.Windowing

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IAppWindowChangedEventArgs.ABI::class)
@Signature("{2182bc5d-fdac-5c3e-bf37-7d8d684e9d1d}")
@Guid("2182bc5dfdac5c3ebf377d8d684e9d1d")
@WinRTInterface("2182bc5dfdac5c3ebf377d8d684e9d1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowChangedEventArgs.ByReference::class)
public interface IAppWindowChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DidPositionChange(): Boolean

  @InterfaceMethod(1)
  public fun get_DidPresenterChange(): Boolean

  @InterfaceMethod(2)
  public fun get_DidSizeChange(): Boolean

  @InterfaceMethod(3)
  public fun get_DidVisibilityChange(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowChangedEventArgs> {
    public override fun getValue() = ABI.makeIAppWindowChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppWindowChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowChangedEventArgs {
    public val __300815267_Ptr: Pointer?

    public val _300815267_VtblPtr: Pointer?
      get() = __300815267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DidPositionChange(): Boolean {
      val fnPtr = _300815267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__300815267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DidPresenterChange(): Boolean {
      val fnPtr = _300815267_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__300815267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_DidSizeChange(): Boolean {
      val fnPtr = _300815267_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__300815267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_DidVisibilityChange(): Boolean {
      val fnPtr = _300815267_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__300815267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppWindowChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __300815267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2182bc5dfdac5c3ebf377d8d684e9d1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppWindowChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppWindowChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__300815267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowChangedEventArgs):
        Array<IAppWindowChangedEventArgs?> = (elements as
        Array<IAppWindowChangedEventArgs?>).castToImpl<IAppWindowChangedEventArgs,IAppWindowChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowChangedEventArgs?> =
        arrayOfNulls<IAppWindowChangedEventArgs_Impl>(size) as Array<IAppWindowChangedEventArgs?>
  }
}
