package Windows.Networking.Vpn

import Windows.Networking.Vpn.IVpnProfile.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnPlugInProfile2.ABI::class)
@Signature("{611c4892-cf94-4ad6-ba99-00f4ff34565e}")
@Guid("611c4892cf944ad6ba9900f4ff34565e")
@WinRTInterface("611c4892cf944ad6ba9900f4ff34565e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnPlugInProfile2.ByReference::class)
public interface IVpnPlugInProfile2 : NativeMapped, IWinRTInterface, IVpnProfile {
  @InterfaceMethod(0)
  public fun get_RequireVpnClientAppUI(): Boolean

  @InterfaceMethod(1)
  public fun put_RequireVpnClientAppUI(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_ConnectionStatus(): VpnManagementConnectionStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnPlugInProfile2> {
    public override fun getValue() = ABI.makeIVpnPlugInProfile2(pointer.getPointer(0))

    public fun setValue(value: IVpnPlugInProfile2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnPlugInProfile2, IVpnProfile.WithDefault {
    public val __2100362124_Ptr: Pointer?

    public val _2100362124_VtblPtr: Pointer?
      get() = __2100362124_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequireVpnClientAppUI(): Boolean {
      val fnPtr = _2100362124_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2100362124_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_RequireVpnClientAppUI(value: Boolean): Unit {
      val fnPtr = _2100362124_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2100362124_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ConnectionStatus(): VpnManagementConnectionStatus? {
      val fnPtr = _2100362124_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnManagementConnectionStatus>()
      val hr = fn.invokeHR(arrayOf(__2100362124_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnManagementConnectionStatus>(result.getValue())
      return resultValue
    }
  }

  public class IVpnPlugInProfile2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnProfile {
    public override val __1256391737_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2100362124_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2100362124_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnPlugInProfile2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("611c4892cf944ad6ba9900f4ff34565e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnPlugInProfile2(ptr: Pointer?): WithDefault = IVpnPlugInProfile2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnPlugInProfile2 {
      val address = segment.toRawLongValue()
      return makeIVpnPlugInProfile2(Pointer(address))
    }

    public override fun toNative(obj: IVpnPlugInProfile2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2100362124_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnPlugInProfile2): Array<IVpnPlugInProfile2?> =
        (elements as
        Array<IVpnPlugInProfile2?>).castToImpl<IVpnPlugInProfile2,IVpnPlugInProfile2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnPlugInProfile2?> =
        arrayOfNulls<IVpnPlugInProfile2_Impl>(size) as Array<IVpnPlugInProfile2?>
  }
}
