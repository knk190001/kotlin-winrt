package Windows.Networking.NetworkOperators

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(INetworkOperatorTetheringAccessPointConfiguration2.ABI::class)
@Signature("{b1809142-7238-59a0-928b-74ab46fd64b6}")
@Guid("b1809142723859a0928b74ab46fd64b6")
@WinRTInterface("b1809142723859a0928b74ab46fd64b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringAccessPointConfiguration2.ByReference::class)
public interface INetworkOperatorTetheringAccessPointConfiguration2 : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun IsBandSupported(band: TetheringWiFiBand?): Boolean

  @InterfaceMethod(1)
  public fun IsBandSupportedAsync(band: TetheringWiFiBand?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun get_Band(): TetheringWiFiBand?

  @InterfaceMethod(3)
  public fun put_Band(value: TetheringWiFiBand?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringAccessPointConfiguration2> {
    public override fun getValue() =
        ABI.makeINetworkOperatorTetheringAccessPointConfiguration2(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringAccessPointConfiguration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringAccessPointConfiguration2 {
    public val __1221053775_Ptr: Pointer?

    public val _1221053775_VtblPtr: Pointer?
      get() = __1221053775_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsBandSupported(band: TetheringWiFiBand?): Boolean {
      val fnPtr = _1221053775_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1221053775_Ptr, marshalToNative(band), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun IsBandSupportedAsync(band: TetheringWiFiBand?): IAsyncOperation<Boolean>? {
      val fnPtr = _1221053775_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1221053775_Ptr, marshalToNative(band), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Band(): TetheringWiFiBand? {
      val fnPtr = _1221053775_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TetheringWiFiBand>()
      val hr = fn.invokeHR(arrayOf(__1221053775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TetheringWiFiBand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Band(value: TetheringWiFiBand?): Unit {
      val fnPtr = _1221053775_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1221053775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INetworkOperatorTetheringAccessPointConfiguration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1221053775_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringAccessPointConfiguration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1809142723859a0928b74ab46fd64b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringAccessPointConfiguration2(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringAccessPointConfiguration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorTetheringAccessPointConfiguration2 {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringAccessPointConfiguration2(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringAccessPointConfiguration2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1221053775_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringAccessPointConfiguration2):
        Array<INetworkOperatorTetheringAccessPointConfiguration2?> = (elements as
        Array<INetworkOperatorTetheringAccessPointConfiguration2?>).castToImpl<INetworkOperatorTetheringAccessPointConfiguration2,INetworkOperatorTetheringAccessPointConfiguration2_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<INetworkOperatorTetheringAccessPointConfiguration2?> =
        arrayOfNulls<INetworkOperatorTetheringAccessPointConfiguration2_Impl>(size) as
        Array<INetworkOperatorTetheringAccessPointConfiguration2?>
  }
}
