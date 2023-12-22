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

@ABIMarker(IVpnForegroundActivatedEventArgs.ABI::class)
@Signature("{85b465b0-cadb-4d70-ac92-543a24dc9ebc}")
@Guid("85b465b0cadb4d70ac92543a24dc9ebc")
@WinRTInterface("85b465b0cadb4d70ac92543a24dc9ebc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnForegroundActivatedEventArgs.ByReference::class)
public interface IVpnForegroundActivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProfileName(): String?

  @InterfaceMethod(1)
  public fun get_SharedContext(): ValueSet?

  @InterfaceMethod(2)
  public fun get_ActivationOperation(): VpnForegroundActivationOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnForegroundActivatedEventArgs> {
    public override fun getValue() = ABI.makeIVpnForegroundActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVpnForegroundActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnForegroundActivatedEventArgs {
    public val __1471276505_Ptr: Pointer?

    public val _1471276505_VtblPtr: Pointer?
      get() = __1471276505_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProfileName(): String? {
      val fnPtr = _1471276505_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1471276505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SharedContext(): ValueSet? {
      val fnPtr = _1471276505_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1471276505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ActivationOperation(): VpnForegroundActivationOperation? {
      val fnPtr = _1471276505_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnForegroundActivationOperation>()
      val hr = fn.invokeHR(arrayOf(__1471276505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnForegroundActivationOperation>(result.getValue())
      return resultValue
    }
  }

  public class IVpnForegroundActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1471276505_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnForegroundActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85b465b0cadb4d70ac92543a24dc9ebc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnForegroundActivatedEventArgs(ptr: Pointer?): WithDefault =
        IVpnForegroundActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnForegroundActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIVpnForegroundActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVpnForegroundActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1471276505_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnForegroundActivatedEventArgs):
        Array<IVpnForegroundActivatedEventArgs?> = (elements as
        Array<IVpnForegroundActivatedEventArgs?>).castToImpl<IVpnForegroundActivatedEventArgs,IVpnForegroundActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnForegroundActivatedEventArgs?> =
        arrayOfNulls<IVpnForegroundActivatedEventArgs_Impl>(size) as
        Array<IVpnForegroundActivatedEventArgs?>
  }
}
