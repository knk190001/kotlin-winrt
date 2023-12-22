package Windows.Media.SpeechRecognition

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeechRecognitionConstraint.ABI::class)
@Signature("{79ac1628-4d68-43c4-8911-40dc4101b55b}")
@Guid("79ac16284d6843c4891140dc4101b55b")
@WinRTInterface("79ac16284d6843c4891140dc4101b55b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionConstraint.ByReference::class)
public interface ISpeechRecognitionConstraint : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Tag(): String?

  @InterfaceMethod(3)
  public fun put_Tag(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Type(): SpeechRecognitionConstraintType?

  @InterfaceMethod(5)
  public fun get_Probability(): SpeechRecognitionConstraintProbability?

  @InterfaceMethod(6)
  public fun put_Probability(value: SpeechRecognitionConstraintProbability?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionConstraint> {
    public override fun getValue() = ABI.makeISpeechRecognitionConstraint(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionConstraint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionConstraint {
    public val __411817545_Ptr: Pointer?

    public val _411817545_VtblPtr: Pointer?
      get() = __411817545_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _411817545_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__411817545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _411817545_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__411817545_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Tag(): String? {
      val fnPtr = _411817545_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__411817545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Tag(value: String?): Unit {
      val fnPtr = _411817545_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__411817545_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Type(): SpeechRecognitionConstraintType? {
      val fnPtr = _411817545_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionConstraintType>()
      val hr = fn.invokeHR(arrayOf(__411817545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionConstraintType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Probability(): SpeechRecognitionConstraintProbability? {
      val fnPtr = _411817545_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionConstraintProbability>()
      val hr = fn.invokeHR(arrayOf(__411817545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionConstraintProbability>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Probability(value: SpeechRecognitionConstraintProbability?): Unit {
      val fnPtr = _411817545_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__411817545_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpeechRecognitionConstraint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __411817545_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionConstraint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79ac16284d6843c4891140dc4101b55b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionConstraint(ptr: Pointer?): WithDefault =
        ISpeechRecognitionConstraint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognitionConstraint {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionConstraint(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionConstraint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__411817545_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionConstraint):
        Array<ISpeechRecognitionConstraint?> = (elements as
        Array<ISpeechRecognitionConstraint?>).castToImpl<ISpeechRecognitionConstraint,ISpeechRecognitionConstraint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionConstraint?> =
        arrayOfNulls<ISpeechRecognitionConstraint_Impl>(size) as
        Array<ISpeechRecognitionConstraint?>
  }
}
