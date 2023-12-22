package Windows.UI.Input

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGestureRecognizer2.ABI::class)
@Signature("{d646097f-6ef7-5746-8ba8-8ff2206e6f3b}")
@Guid("d646097f6ef757468ba88ff2206e6f3b")
@WinRTInterface("d646097f6ef757468ba88ff2206e6f3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGestureRecognizer2.ByReference::class)
public interface IGestureRecognizer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TapMinContactCount(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_TapMinContactCount(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_TapMaxContactCount(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_TapMaxContactCount(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_HoldMinContactCount(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_HoldMinContactCount(value: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun get_HoldMaxContactCount(): WinDef.UINT

  @InterfaceMethod(7)
  public fun put_HoldMaxContactCount(value: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun get_HoldRadius(): Float

  @InterfaceMethod(9)
  public fun put_HoldRadius(value: Float): Unit

  @InterfaceMethod(10)
  public fun get_HoldStartDelay(): TimeSpan?

  @InterfaceMethod(11)
  public fun put_HoldStartDelay(value: TimeSpan?): Unit

  @InterfaceMethod(12)
  public fun get_TranslationMinContactCount(): WinDef.UINT

  @InterfaceMethod(13)
  public fun put_TranslationMinContactCount(value: WinDef.UINT): Unit

  @InterfaceMethod(14)
  public fun get_TranslationMaxContactCount(): WinDef.UINT

  @InterfaceMethod(15)
  public fun put_TranslationMaxContactCount(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGestureRecognizer2> {
    public override fun getValue() = ABI.makeIGestureRecognizer2(pointer.getPointer(0))

    public fun setValue(value: IGestureRecognizer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGestureRecognizer2 {
    public val __544125779_Ptr: Pointer?

    public val _544125779_VtblPtr: Pointer?
      get() = __544125779_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TapMinContactCount(): WinDef.UINT {
      val fnPtr = _544125779_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_TapMinContactCount(value: WinDef.UINT): Unit {
      val fnPtr = _544125779_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TapMaxContactCount(): WinDef.UINT {
      val fnPtr = _544125779_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_TapMaxContactCount(value: WinDef.UINT): Unit {
      val fnPtr = _544125779_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HoldMinContactCount(): WinDef.UINT {
      val fnPtr = _544125779_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_HoldMinContactCount(value: WinDef.UINT): Unit {
      val fnPtr = _544125779_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_HoldMaxContactCount(): WinDef.UINT {
      val fnPtr = _544125779_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_HoldMaxContactCount(value: WinDef.UINT): Unit {
      val fnPtr = _544125779_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_HoldRadius(): Float {
      val fnPtr = _544125779_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_HoldRadius(value: Float): Unit {
      val fnPtr = _544125779_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_HoldStartDelay(): TimeSpan? {
      val fnPtr = _544125779_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_HoldStartDelay(value: TimeSpan?): Unit {
      val fnPtr = _544125779_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_TranslationMinContactCount(): WinDef.UINT {
      val fnPtr = _544125779_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_TranslationMinContactCount(value: WinDef.UINT): Unit {
      val fnPtr = _544125779_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TranslationMaxContactCount(): WinDef.UINT {
      val fnPtr = _544125779_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_TranslationMaxContactCount(value: WinDef.UINT): Unit {
      val fnPtr = _544125779_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__544125779_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGestureRecognizer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __544125779_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGestureRecognizer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d646097f6ef757468ba88ff2206e6f3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGestureRecognizer2(ptr: Pointer?): WithDefault = IGestureRecognizer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGestureRecognizer2 {
      val address = segment.toRawLongValue()
      return makeIGestureRecognizer2(Pointer(address))
    }

    public override fun toNative(obj: IGestureRecognizer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__544125779_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGestureRecognizer2): Array<IGestureRecognizer2?> =
        (elements as
        Array<IGestureRecognizer2?>).castToImpl<IGestureRecognizer2,IGestureRecognizer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGestureRecognizer2?> =
        arrayOfNulls<IGestureRecognizer2_Impl>(size) as Array<IGestureRecognizer2?>
  }
}
