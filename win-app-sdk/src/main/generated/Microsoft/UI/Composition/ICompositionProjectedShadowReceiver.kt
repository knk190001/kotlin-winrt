package Microsoft.UI.Composition

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

@ABIMarker(ICompositionProjectedShadowReceiver.ABI::class)
@Signature("{29fe12b0-f1a0-50e1-af28-2e943bc819d6}")
@Guid("29fe12b0f1a050e1af282e943bc819d6")
@WinRTInterface("29fe12b0f1a050e1af282e943bc819d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionProjectedShadowReceiver.ByReference::class)
public interface ICompositionProjectedShadowReceiver : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReceivingVisual(): Visual?

  @InterfaceMethod(1)
  public fun put_ReceivingVisual(value: Visual?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionProjectedShadowReceiver> {
    public override fun getValue() =
        ABI.makeICompositionProjectedShadowReceiver(pointer.getPointer(0))

    public fun setValue(value: ICompositionProjectedShadowReceiver_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionProjectedShadowReceiver {
    public val __385582998_Ptr: Pointer?

    public val _385582998_VtblPtr: Pointer?
      get() = __385582998_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReceivingVisual(): Visual? {
      val fnPtr = _385582998_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__385582998_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ReceivingVisual(value: Visual?): Unit {
      val fnPtr = _385582998_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__385582998_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionProjectedShadowReceiver_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __385582998_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionProjectedShadowReceiver, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29fe12b0f1a050e1af282e943bc819d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionProjectedShadowReceiver(ptr: Pointer?): WithDefault =
        ICompositionProjectedShadowReceiver_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionProjectedShadowReceiver {
      val address = segment.toRawLongValue()
      return makeICompositionProjectedShadowReceiver(Pointer(address))
    }

    public override fun toNative(obj: ICompositionProjectedShadowReceiver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__385582998_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionProjectedShadowReceiver):
        Array<ICompositionProjectedShadowReceiver?> = (elements as
        Array<ICompositionProjectedShadowReceiver?>).castToImpl<ICompositionProjectedShadowReceiver,ICompositionProjectedShadowReceiver_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionProjectedShadowReceiver?> =
        arrayOfNulls<ICompositionProjectedShadowReceiver_Impl>(size) as
        Array<ICompositionProjectedShadowReceiver?>
  }
}
