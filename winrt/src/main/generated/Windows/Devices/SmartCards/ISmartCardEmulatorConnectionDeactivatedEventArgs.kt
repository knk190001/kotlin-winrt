package Windows.Devices.SmartCards

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

@ABIMarker(ISmartCardEmulatorConnectionDeactivatedEventArgs.ABI::class)
@Signature("{2186d8d3-c5eb-5262-43df-62a0a1b55557}")
@Guid("2186d8d3c5eb526243df62a0a1b55557")
@WinRTInterface("2186d8d3c5eb526243df62a0a1b55557")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardEmulatorConnectionDeactivatedEventArgs.ByReference::class)
public interface ISmartCardEmulatorConnectionDeactivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConnectionProperties(): SmartCardEmulatorConnectionProperties?

  @InterfaceMethod(1)
  public fun get_Reason(): SmartCardEmulatorConnectionDeactivatedReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardEmulatorConnectionDeactivatedEventArgs> {
    public override fun getValue() =
        ABI.makeISmartCardEmulatorConnectionDeactivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISmartCardEmulatorConnectionDeactivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardEmulatorConnectionDeactivatedEventArgs {
    public val __43581632_Ptr: Pointer?

    public val _43581632_VtblPtr: Pointer?
      get() = __43581632_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConnectionProperties(): SmartCardEmulatorConnectionProperties? {
      val fnPtr = _43581632_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardEmulatorConnectionProperties>()
      val hr = fn.invokeHR(arrayOf(__43581632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardEmulatorConnectionProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Reason(): SmartCardEmulatorConnectionDeactivatedReason? {
      val fnPtr = _43581632_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardEmulatorConnectionDeactivatedReason>()
      val hr = fn.invokeHR(arrayOf(__43581632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SmartCardEmulatorConnectionDeactivatedReason>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardEmulatorConnectionDeactivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __43581632_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardEmulatorConnectionDeactivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2186d8d3c5eb526243df62a0a1b55557")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardEmulatorConnectionDeactivatedEventArgs(ptr: Pointer?): WithDefault =
        ISmartCardEmulatorConnectionDeactivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISmartCardEmulatorConnectionDeactivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeISmartCardEmulatorConnectionDeactivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardEmulatorConnectionDeactivatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__43581632_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardEmulatorConnectionDeactivatedEventArgs):
        Array<ISmartCardEmulatorConnectionDeactivatedEventArgs?> = (elements as
        Array<ISmartCardEmulatorConnectionDeactivatedEventArgs?>).castToImpl<ISmartCardEmulatorConnectionDeactivatedEventArgs,ISmartCardEmulatorConnectionDeactivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardEmulatorConnectionDeactivatedEventArgs?>
        = arrayOfNulls<ISmartCardEmulatorConnectionDeactivatedEventArgs_Impl>(size) as
        Array<ISmartCardEmulatorConnectionDeactivatedEventArgs?>
  }
}
