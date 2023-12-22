package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Uri
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

@ABIMarker(IVpnChannelConfiguration2.ABI::class)
@Signature("{f30b574c-7824-471c-a118-63dbc93ae4c7}")
@Guid("f30b574c7824471ca11863dbc93ae4c7")
@WinRTInterface("f30b574c7824471ca11863dbc93ae4c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnChannelConfiguration2.ByReference::class)
public interface IVpnChannelConfiguration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ServerUris(): IVectorView<Uri?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnChannelConfiguration2> {
    public override fun getValue() = ABI.makeIVpnChannelConfiguration2(pointer.getPointer(0))

    public fun setValue(value: IVpnChannelConfiguration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnChannelConfiguration2 {
    public val __992194671_Ptr: Pointer?

    public val _992194671_VtblPtr: Pointer?
      get() = __992194671_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServerUris(): IVectorView<Uri?>? {
      val fnPtr = _992194671_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__992194671_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Uri?>>(result.getValue())
      return resultValue
    }
  }

  public class IVpnChannelConfiguration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __992194671_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnChannelConfiguration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f30b574c7824471ca11863dbc93ae4c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnChannelConfiguration2(ptr: Pointer?): WithDefault =
        IVpnChannelConfiguration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnChannelConfiguration2 {
      val address = segment.toRawLongValue()
      return makeIVpnChannelConfiguration2(Pointer(address))
    }

    public override fun toNative(obj: IVpnChannelConfiguration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__992194671_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnChannelConfiguration2):
        Array<IVpnChannelConfiguration2?> = (elements as
        Array<IVpnChannelConfiguration2?>).castToImpl<IVpnChannelConfiguration2,IVpnChannelConfiguration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnChannelConfiguration2?> =
        arrayOfNulls<IVpnChannelConfiguration2_Impl>(size) as Array<IVpnChannelConfiguration2?>
  }
}
