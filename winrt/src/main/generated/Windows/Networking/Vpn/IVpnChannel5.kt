package Windows.Networking.Vpn

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

@ABIMarker(IVpnChannel5.ABI::class)
@Signature("{de7a0992-8384-4fbc-882c-1fd23124cd3b}")
@Guid("de7a099283844fbc882c1fd23124cd3b")
@WinRTInterface("de7a099283844fbc882c1fd23124cd3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnChannel5.ByReference::class)
public interface IVpnChannel5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AppendVpnReceivePacketBuffer(decapsulatedPacketBuffer: VpnPacketBuffer?): Unit

  @InterfaceMethod(1)
  public fun AppendVpnSendPacketBuffer(encapsulatedPacketBuffer: VpnPacketBuffer?): Unit

  @InterfaceMethod(2)
  public fun FlushVpnReceivePacketBuffers(): Unit

  @InterfaceMethod(3)
  public fun FlushVpnSendPacketBuffers(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVpnChannel5> {
    public override fun getValue() = ABI.makeIVpnChannel5(pointer.getPointer(0))

    public fun setValue(value: IVpnChannel5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnChannel5 {
    public val __1566639358_Ptr: Pointer?

    public val _1566639358_VtblPtr: Pointer?
      get() = __1566639358_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AppendVpnReceivePacketBuffer(decapsulatedPacketBuffer: VpnPacketBuffer?):
        Unit {
      val fnPtr = _1566639358_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639358_Ptr, marshalToNative(decapsulatedPacketBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun AppendVpnSendPacketBuffer(encapsulatedPacketBuffer: VpnPacketBuffer?):
        Unit {
      val fnPtr = _1566639358_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639358_Ptr, marshalToNative(encapsulatedPacketBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun FlushVpnReceivePacketBuffers(): Unit {
      val fnPtr = _1566639358_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639358_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun FlushVpnSendPacketBuffers(): Unit {
      val fnPtr = _1566639358_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639358_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnChannel5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1566639358_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnChannel5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de7a099283844fbc882c1fd23124cd3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnChannel5(ptr: Pointer?): WithDefault = IVpnChannel5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnChannel5 {
      val address = segment.toRawLongValue()
      return makeIVpnChannel5(Pointer(address))
    }

    public override fun toNative(obj: IVpnChannel5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1566639358_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnChannel5): Array<IVpnChannel5?> = (elements as
        Array<IVpnChannel5?>).castToImpl<IVpnChannel5,IVpnChannel5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnChannel5?> =
        arrayOfNulls<IVpnChannel5_Impl>(size) as Array<IVpnChannel5?>
  }
}
