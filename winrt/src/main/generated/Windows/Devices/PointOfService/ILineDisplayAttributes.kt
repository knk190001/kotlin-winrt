package Windows.Devices.PointOfService

import Windows.Foundation.Size
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILineDisplayAttributes.ABI::class)
@Signature("{c17de99c-229a-4c14-a6f1-b4e4b1fead92}")
@Guid("c17de99c229a4c14a6f1b4e4b1fead92")
@WinRTInterface("c17de99c229a4c14a6f1b4e4b1fead92")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayAttributes.ByReference::class)
public interface ILineDisplayAttributes : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPowerNotifyEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsPowerNotifyEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Brightness(): Int

  @InterfaceMethod(3)
  public fun put_Brightness(value: Int): Unit

  @InterfaceMethod(4)
  public fun get_BlinkRate(): TimeSpan?

  @InterfaceMethod(5)
  public fun put_BlinkRate(value: TimeSpan?): Unit

  @InterfaceMethod(6)
  public fun get_ScreenSizeInCharacters(): Size?

  @InterfaceMethod(7)
  public fun put_ScreenSizeInCharacters(value: Size?): Unit

  @InterfaceMethod(8)
  public fun get_CharacterSet(): Int

  @InterfaceMethod(9)
  public fun put_CharacterSet(value: Int): Unit

  @InterfaceMethod(10)
  public fun get_IsCharacterSetMappingEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsCharacterSetMappingEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_CurrentWindow(): LineDisplayWindow?

  @InterfaceMethod(13)
  public fun put_CurrentWindow(value: LineDisplayWindow?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayAttributes> {
    public override fun getValue() = ABI.makeILineDisplayAttributes(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayAttributes_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayAttributes {
    public val __490494054_Ptr: Pointer?

    public val _490494054_VtblPtr: Pointer?
      get() = __490494054_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPowerNotifyEnabled(): Boolean {
      val fnPtr = _490494054_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsPowerNotifyEnabled(value: Boolean): Unit {
      val fnPtr = _490494054_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Brightness(): Int {
      val fnPtr = _490494054_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Brightness(value: Int): Unit {
      val fnPtr = _490494054_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BlinkRate(): TimeSpan? {
      val fnPtr = _490494054_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BlinkRate(value: TimeSpan?): Unit {
      val fnPtr = _490494054_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ScreenSizeInCharacters(): Size? {
      val fnPtr = _490494054_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ScreenSizeInCharacters(value: Size?): Unit {
      val fnPtr = _490494054_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CharacterSet(): Int {
      val fnPtr = _490494054_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_CharacterSet(value: Int): Unit {
      val fnPtr = _490494054_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsCharacterSetMappingEnabled(): Boolean {
      val fnPtr = _490494054_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsCharacterSetMappingEnabled(value: Boolean): Unit {
      val fnPtr = _490494054_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_CurrentWindow(): LineDisplayWindow? {
      val fnPtr = _490494054_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayWindow>()
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayWindow>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_CurrentWindow(value: LineDisplayWindow?): Unit {
      val fnPtr = _490494054_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__490494054_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILineDisplayAttributes_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __490494054_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayAttributes, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c17de99c229a4c14a6f1b4e4b1fead92")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayAttributes(ptr: Pointer?): WithDefault =
        ILineDisplayAttributes_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayAttributes {
      val address = segment.toRawLongValue()
      return makeILineDisplayAttributes(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayAttributes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__490494054_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayAttributes): Array<ILineDisplayAttributes?> =
        (elements as
        Array<ILineDisplayAttributes?>).castToImpl<ILineDisplayAttributes,ILineDisplayAttributes_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayAttributes?> =
        arrayOfNulls<ILineDisplayAttributes_Impl>(size) as Array<ILineDisplayAttributes?>
  }
}
