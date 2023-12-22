package Windows.Media.SpeechRecognition

import Windows.Foundation.TimeSpan
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeechRecognizerTimeouts.ABI::class)
@Signature("{2ef76fca-6a3c-4dca-a153-df1bc88a79af}")
@Guid("2ef76fca6a3c4dcaa153df1bc88a79af")
@WinRTInterface("2ef76fca6a3c4dcaa153df1bc88a79af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognizerTimeouts.ByReference::class)
public interface ISpeechRecognizerTimeouts : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InitialSilenceTimeout(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_InitialSilenceTimeout(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_EndSilenceTimeout(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_EndSilenceTimeout(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_BabbleTimeout(): TimeSpan?

  @InterfaceMethod(5)
  public fun put_BabbleTimeout(value: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognizerTimeouts> {
    public override fun getValue() = ABI.makeISpeechRecognizerTimeouts(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognizerTimeouts_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognizerTimeouts {
    public val __758721_Ptr: Pointer?

    public val _758721_VtblPtr: Pointer?
      get() = __758721_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InitialSilenceTimeout(): TimeSpan? {
      val fnPtr = _758721_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__758721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InitialSilenceTimeout(value: TimeSpan?): Unit {
      val fnPtr = _758721_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_EndSilenceTimeout(): TimeSpan? {
      val fnPtr = _758721_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__758721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_EndSilenceTimeout(value: TimeSpan?): Unit {
      val fnPtr = _758721_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BabbleTimeout(): TimeSpan? {
      val fnPtr = _758721_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__758721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BabbleTimeout(value: TimeSpan?): Unit {
      val fnPtr = _758721_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpeechRecognizerTimeouts_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __758721_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognizerTimeouts, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ef76fca6a3c4dcaa153df1bc88a79af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognizerTimeouts(ptr: Pointer?): WithDefault =
        ISpeechRecognizerTimeouts_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognizerTimeouts {
      val address = segment.toRawLongValue()
      return makeISpeechRecognizerTimeouts(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognizerTimeouts): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__758721_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognizerTimeouts):
        Array<ISpeechRecognizerTimeouts?> = (elements as
        Array<ISpeechRecognizerTimeouts?>).castToImpl<ISpeechRecognizerTimeouts,ISpeechRecognizerTimeouts_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognizerTimeouts?> =
        arrayOfNulls<ISpeechRecognizerTimeouts_Impl>(size) as Array<ISpeechRecognizerTimeouts?>
  }
}
