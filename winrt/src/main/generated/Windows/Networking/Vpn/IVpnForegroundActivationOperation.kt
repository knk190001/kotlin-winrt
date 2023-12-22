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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnForegroundActivationOperation.ABI::class)
@Signature("{9e010d57-f17a-4bd5-9b6d-f984f1297d3c}")
@Guid("9e010d57f17a4bd59b6df984f1297d3c")
@WinRTInterface("9e010d57f17a4bd59b6df984f1297d3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnForegroundActivationOperation.ByReference::class)
public interface IVpnForegroundActivationOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(result: ValueSet?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnForegroundActivationOperation> {
    public override fun getValue() =
        ABI.makeIVpnForegroundActivationOperation(pointer.getPointer(0))

    public fun setValue(value: IVpnForegroundActivationOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnForegroundActivationOperation {
    public val __1164596542_Ptr: Pointer?

    public val _1164596542_VtblPtr: Pointer?
      get() = __1164596542_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(result: ValueSet?): Unit {
      val fnPtr = _1164596542_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1164596542_Ptr, marshalToNative(result),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnForegroundActivationOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1164596542_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnForegroundActivationOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e010d57f17a4bd59b6df984f1297d3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnForegroundActivationOperation(ptr: Pointer?): WithDefault =
        IVpnForegroundActivationOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnForegroundActivationOperation {
      val address = segment.toRawLongValue()
      return makeIVpnForegroundActivationOperation(Pointer(address))
    }

    public override fun toNative(obj: IVpnForegroundActivationOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1164596542_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnForegroundActivationOperation):
        Array<IVpnForegroundActivationOperation?> = (elements as
        Array<IVpnForegroundActivationOperation?>).castToImpl<IVpnForegroundActivationOperation,IVpnForegroundActivationOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnForegroundActivationOperation?> =
        arrayOfNulls<IVpnForegroundActivationOperation_Impl>(size) as
        Array<IVpnForegroundActivationOperation?>
  }
}
