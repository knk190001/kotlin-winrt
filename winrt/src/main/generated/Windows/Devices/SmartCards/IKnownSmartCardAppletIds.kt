package Windows.Devices.SmartCards

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IKnownSmartCardAppletIds.ABI::class)
@Signature("{7b04d8d8-95b4-4c88-8cea-411e55511efc}")
@Guid("7b04d8d895b44c888cea411e55511efc")
@WinRTInterface("7b04d8d895b44c888cea411e55511efc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownSmartCardAppletIds.ByReference::class)
public interface IKnownSmartCardAppletIds : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PaymentSystemEnvironment(): IBuffer?

  @InterfaceMethod(1)
  public fun get_ProximityPaymentSystemEnvironment(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownSmartCardAppletIds> {
    public override fun getValue() = ABI.makeIKnownSmartCardAppletIds(pointer.getPointer(0))

    public fun setValue(value: IKnownSmartCardAppletIds_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownSmartCardAppletIds {
    public val __57559573_Ptr: Pointer?

    public val _57559573_VtblPtr: Pointer?
      get() = __57559573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PaymentSystemEnvironment(): IBuffer? {
      val fnPtr = _57559573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__57559573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProximityPaymentSystemEnvironment(): IBuffer? {
      val fnPtr = _57559573_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__57559573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IKnownSmartCardAppletIds_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __57559573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownSmartCardAppletIds, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b04d8d895b44c888cea411e55511efc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownSmartCardAppletIds(ptr: Pointer?): WithDefault =
        IKnownSmartCardAppletIds_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownSmartCardAppletIds {
      val address = segment.toRawLongValue()
      return makeIKnownSmartCardAppletIds(Pointer(address))
    }

    public override fun toNative(obj: IKnownSmartCardAppletIds): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__57559573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownSmartCardAppletIds):
        Array<IKnownSmartCardAppletIds?> = (elements as
        Array<IKnownSmartCardAppletIds?>).castToImpl<IKnownSmartCardAppletIds,IKnownSmartCardAppletIds_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownSmartCardAppletIds?> =
        arrayOfNulls<IKnownSmartCardAppletIds_Impl>(size) as Array<IKnownSmartCardAppletIds?>
  }
}
