package Windows.Foundation.Diagnostics

import Windows.Foundation.Diagnostics.ILoggingActivity.ABI.IID
import Windows.Foundation.IClosable
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILoggingActivity2.ABI::class)
@Signature("{26c29808-6322-456a-af82-80c8642f178b}")
@Guid("26c298086322456aaf8280c8642f178b")
@WinRTInterface("26c298086322456aaf8280c8642f178b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingActivity2.ByReference::class)
public interface ILoggingActivity2 : NativeMapped, IWinRTInterface, ILoggingActivity, IClosable,
    ILoggingTarget {
  @InterfaceMethod(0)
  public fun get_Channel(): LoggingChannel?

  @InterfaceMethod(1)
  public fun StopActivity(stopEventName: String?): Unit

  @InterfaceMethod(2)
  public fun StopActivity(stopEventName: String?, fields: LoggingFields?): Unit

  @InterfaceMethod(3)
  public fun StopActivity(
    stopEventName: String?,
    fields: LoggingFields?,
    options: LoggingOptions?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingActivity2> {
    public override fun getValue() = ABI.makeILoggingActivity2(pointer.getPointer(0))

    public fun setValue(value: ILoggingActivity2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingActivity2, ILoggingActivity.WithDefault,
      IClosable.WithDefault, ILoggingTarget.WithDefault {
    public val __713556111_Ptr: Pointer?

    public val _713556111_VtblPtr: Pointer?
      get() = __713556111_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Channel(): LoggingChannel? {
      val fnPtr = _713556111_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingChannel>()
      val hr = fn.invokeHR(arrayOf(__713556111_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingChannel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StopActivity(stopEventName: String?): Unit {
      val fnPtr = _713556111_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__713556111_Ptr, marshalToNative(stopEventName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun StopActivity(stopEventName: String?, fields: LoggingFields?): Unit {
      val fnPtr = _713556111_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__713556111_Ptr, marshalToNative(stopEventName),
          marshalToNative(fields),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun StopActivity(
      stopEventName: String?,
      fields: LoggingFields?,
      options: LoggingOptions?
    ): Unit {
      val fnPtr = _713556111_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__713556111_Ptr, marshalToNative(stopEventName),
          marshalToNative(fields), marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILoggingActivity2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ILoggingActivity, IClosable,
      ILoggingTarget {
    public override val __1778097377_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_713556111_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_713556111_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1118672925_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(ILoggingTarget.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_713556111_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __713556111_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingActivity2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26c298086322456aaf8280c8642f178b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingActivity2(ptr: Pointer?): WithDefault = ILoggingActivity2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingActivity2 {
      val address = segment.toRawLongValue()
      return makeILoggingActivity2(Pointer(address))
    }

    public override fun toNative(obj: ILoggingActivity2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__713556111_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingActivity2): Array<ILoggingActivity2?> = (elements
        as Array<ILoggingActivity2?>).castToImpl<ILoggingActivity2,ILoggingActivity2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingActivity2?> =
        arrayOfNulls<ILoggingActivity2_Impl>(size) as Array<ILoggingActivity2?>
  }
}
