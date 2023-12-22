package Windows.Phone.Notification.Management

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeedDialEntry.ABI::class)
@Signature("{9240b6db-872c-46dc-b62a-be4541b166f8}")
@Guid("9240b6db872c46dcb62abe4541b166f8")
@WinRTInterface("9240b6db872c46dcb62abe4541b166f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeedDialEntry.ByReference::class)
public interface ISpeedDialEntry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PhoneNumber(): String?

  @InterfaceMethod(1)
  public fun get_NumberType(): String?

  @InterfaceMethod(2)
  public fun get_ContactName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeedDialEntry> {
    public override fun getValue() = ABI.makeISpeedDialEntry(pointer.getPointer(0))

    public fun setValue(value: ISpeedDialEntry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeedDialEntry {
    public val __784061591_Ptr: Pointer?

    public val _784061591_VtblPtr: Pointer?
      get() = __784061591_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PhoneNumber(): String? {
      val fnPtr = _784061591_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__784061591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NumberType(): String? {
      val fnPtr = _784061591_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__784061591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ContactName(): String? {
      val fnPtr = _784061591_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__784061591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISpeedDialEntry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __784061591_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeedDialEntry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9240b6db872c46dcb62abe4541b166f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeedDialEntry(ptr: Pointer?): WithDefault = ISpeedDialEntry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeedDialEntry {
      val address = segment.toRawLongValue()
      return makeISpeedDialEntry(Pointer(address))
    }

    public override fun toNative(obj: ISpeedDialEntry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__784061591_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeedDialEntry): Array<ISpeedDialEntry?> = (elements as
        Array<ISpeedDialEntry?>).castToImpl<ISpeedDialEntry,ISpeedDialEntry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeedDialEntry?> =
        arrayOfNulls<ISpeedDialEntry_Impl>(size) as Array<ISpeedDialEntry?>
  }
}
