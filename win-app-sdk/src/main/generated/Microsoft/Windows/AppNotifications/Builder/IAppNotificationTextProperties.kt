package Microsoft.Windows.AppNotifications.Builder

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

@ABIMarker(IAppNotificationTextProperties.ABI::class)
@Signature("{23a30d0b-5258-5853-932e-9521a3642afb}")
@Guid("23a30d0b52585853932e9521a3642afb")
@WinRTInterface("23a30d0b52585853932e9521a3642afb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationTextProperties.ByReference::class)
public interface IAppNotificationTextProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Language(): String?

  @InterfaceMethod(1)
  public fun put_Language(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_IncomingCallAlignment(): Boolean

  @InterfaceMethod(3)
  public fun put_IncomingCallAlignment(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_MaxLines(): Int

  @InterfaceMethod(5)
  public fun put_MaxLines(value: Int): Unit

  @InterfaceMethod(6)
  public fun SetLanguage(value: String?): AppNotificationTextProperties?

  @InterfaceMethod(7)
  public fun SetIncomingCallAlignment(): AppNotificationTextProperties?

  @InterfaceMethod(8)
  public fun SetMaxLines(value: Int): AppNotificationTextProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationTextProperties> {
    public override fun getValue() = ABI.makeIAppNotificationTextProperties(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationTextProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationTextProperties {
    public val __1100363330_Ptr: Pointer?

    public val _1100363330_VtblPtr: Pointer?
      get() = __1100363330_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Language(): String? {
      val fnPtr = _1100363330_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1100363330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Language(value: String?): Unit {
      val fnPtr = _1100363330_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1100363330_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IncomingCallAlignment(): Boolean {
      val fnPtr = _1100363330_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1100363330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IncomingCallAlignment(value: Boolean): Unit {
      val fnPtr = _1100363330_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1100363330_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxLines(): Int {
      val fnPtr = _1100363330_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1100363330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaxLines(value: Int): Unit {
      val fnPtr = _1100363330_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1100363330_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetLanguage(value: String?): AppNotificationTextProperties? {
      val fnPtr = _1100363330_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationTextProperties>()
      val hr = fn.invokeHR(arrayOf(__1100363330_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationTextProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun SetIncomingCallAlignment(): AppNotificationTextProperties? {
      val fnPtr = _1100363330_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationTextProperties>()
      val hr = fn.invokeHR(arrayOf(__1100363330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationTextProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetMaxLines(value: Int): AppNotificationTextProperties? {
      val fnPtr = _1100363330_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationTextProperties>()
      val hr = fn.invokeHR(arrayOf(__1100363330_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationTextProperties>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationTextProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1100363330_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationTextProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23a30d0b52585853932e9521a3642afb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationTextProperties(ptr: Pointer?): WithDefault =
        IAppNotificationTextProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationTextProperties {
      val address = segment.toRawLongValue()
      return makeIAppNotificationTextProperties(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationTextProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1100363330_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationTextProperties):
        Array<IAppNotificationTextProperties?> = (elements as
        Array<IAppNotificationTextProperties?>).castToImpl<IAppNotificationTextProperties,IAppNotificationTextProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationTextProperties?> =
        arrayOfNulls<IAppNotificationTextProperties_Impl>(size) as
        Array<IAppNotificationTextProperties?>
  }
}
