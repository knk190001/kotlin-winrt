package Windows.Networking.Vpn

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IVpnChannel6.ABI::class)
@Signature("{55843696-bd63-49c5-abca-5da77885551a}")
@Guid("55843696bd6349c5abca5da77885551a")
@WinRTInterface("55843696bd6349c5abca5da77885551a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnChannel6.ByReference::class)
public interface IVpnChannel6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ActivateForeground(packageRelativeAppId: String?, sharedContext: ValueSet?): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVpnChannel6> {
    public override fun getValue() = ABI.makeIVpnChannel6(pointer.getPointer(0))

    public fun setValue(value: IVpnChannel6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnChannel6 {
    public val __1566639357_Ptr: Pointer?

    public val _1566639357_VtblPtr: Pointer?
      get() = __1566639357_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ActivateForeground(packageRelativeAppId: String?, sharedContext: ValueSet?):
        ValueSet? {
      val fnPtr = _1566639357_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1566639357_Ptr, marshalToNative(packageRelativeAppId),
          marshalToNative(sharedContext), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IVpnChannel6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1566639357_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnChannel6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55843696bd6349c5abca5da77885551a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnChannel6(ptr: Pointer?): WithDefault = IVpnChannel6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnChannel6 {
      val address = segment.toRawLongValue()
      return makeIVpnChannel6(Pointer(address))
    }

    public override fun toNative(obj: IVpnChannel6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1566639357_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnChannel6): Array<IVpnChannel6?> = (elements as
        Array<IVpnChannel6?>).castToImpl<IVpnChannel6,IVpnChannel6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnChannel6?> =
        arrayOfNulls<IVpnChannel6_Impl>(size) as Array<IVpnChannel6?>
  }
}
