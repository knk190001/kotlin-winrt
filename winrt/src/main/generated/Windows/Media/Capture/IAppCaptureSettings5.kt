package Windows.Media.Capture

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

@ABIMarker(IAppCaptureSettings5.ABI::class)
@Signature("{18894522-b0e8-4ba0-8f13-3eaa5fa4013b}")
@Guid("18894522b0e84ba08f133eaa5fa4013b")
@WinRTInterface("18894522b0e84ba08f133eaa5fa4013b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureSettings5.ByReference::class)
public interface IAppCaptureSettings5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_IsEchoCancellationEnabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_IsEchoCancellationEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_IsCursorImageCaptureEnabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsCursorImageCaptureEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureSettings5> {
    public override fun getValue() = ABI.makeIAppCaptureSettings5(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureSettings5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureSettings5 {
    public val __1431836363_Ptr: Pointer?

    public val _1431836363_VtblPtr: Pointer?
      get() = __1431836363_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsEchoCancellationEnabled(value: Boolean): Unit {
      val fnPtr = _1431836363_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1431836363_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsEchoCancellationEnabled(): Boolean {
      val fnPtr = _1431836363_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1431836363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsCursorImageCaptureEnabled(value: Boolean): Unit {
      val fnPtr = _1431836363_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1431836363_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsCursorImageCaptureEnabled(): Boolean {
      val fnPtr = _1431836363_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1431836363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppCaptureSettings5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1431836363_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureSettings5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18894522b0e84ba08f133eaa5fa4013b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureSettings5(ptr: Pointer?): WithDefault = IAppCaptureSettings5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureSettings5 {
      val address = segment.toRawLongValue()
      return makeIAppCaptureSettings5(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureSettings5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1431836363_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureSettings5): Array<IAppCaptureSettings5?> =
        (elements as
        Array<IAppCaptureSettings5?>).castToImpl<IAppCaptureSettings5,IAppCaptureSettings5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureSettings5?> =
        arrayOfNulls<IAppCaptureSettings5_Impl>(size) as Array<IAppCaptureSettings5?>
  }
}
