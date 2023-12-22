package Windows.Media.Protection.PlayReady

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(INDProximityDetectionCompletedEventArgs.ABI::class)
@Signature("{2a706328-da25-4f8c-9eb7-5d0fc3658bca}")
@Guid("2a706328da254f8c9eb75d0fc3658bca")
@WinRTInterface("2a706328da254f8c9eb75d0fc3658bca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDProximityDetectionCompletedEventArgs.ByReference::class)
public interface INDProximityDetectionCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProximityDetectionRetryCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDProximityDetectionCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeINDProximityDetectionCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INDProximityDetectionCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDProximityDetectionCompletedEventArgs {
    public val __1737433378_Ptr: Pointer?

    public val _1737433378_VtblPtr: Pointer?
      get() = __1737433378_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProximityDetectionRetryCount(): WinDef.UINT {
      val fnPtr = _1737433378_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1737433378_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class INDProximityDetectionCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1737433378_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDProximityDetectionCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a706328da254f8c9eb75d0fc3658bca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDProximityDetectionCompletedEventArgs(ptr: Pointer?): WithDefault =
        INDProximityDetectionCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INDProximityDetectionCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeINDProximityDetectionCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INDProximityDetectionCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1737433378_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDProximityDetectionCompletedEventArgs):
        Array<INDProximityDetectionCompletedEventArgs?> = (elements as
        Array<INDProximityDetectionCompletedEventArgs?>).castToImpl<INDProximityDetectionCompletedEventArgs,INDProximityDetectionCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDProximityDetectionCompletedEventArgs?> =
        arrayOfNulls<INDProximityDetectionCompletedEventArgs_Impl>(size) as
        Array<INDProximityDetectionCompletedEventArgs?>
  }
}
