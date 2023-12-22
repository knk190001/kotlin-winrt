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

@ABIMarker(IExpCompositionProjectedShadowReceiver.ABI::class)
@Signature("{85a2028b-896b-56a2-896b-5985ba7fb0cf}")
@Guid("85a2028b896b56a2896b5985ba7fb0cf")
@WinRTInterface("85a2028b896b56a2896b5985ba7fb0cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpCompositionProjectedShadowReceiver.ByReference::class)
public interface IExpCompositionProjectedShadowReceiver : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DrawOrder(): CompositionProjectedShadowDrawOrder?

  @InterfaceMethod(1)
  public fun put_DrawOrder(value: CompositionProjectedShadowDrawOrder?): Unit

  @InterfaceMethod(2)
  public fun get_Mask(): CompositionBrush?

  @InterfaceMethod(3)
  public fun put_Mask(value: CompositionBrush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpCompositionProjectedShadowReceiver> {
    public override fun getValue() =
        ABI.makeIExpCompositionProjectedShadowReceiver(pointer.getPointer(0))

    public fun setValue(value: IExpCompositionProjectedShadowReceiver_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpCompositionProjectedShadowReceiver {
    public val __682346561_Ptr: Pointer?

    public val _682346561_VtblPtr: Pointer?
      get() = __682346561_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DrawOrder(): CompositionProjectedShadowDrawOrder? {
      val fnPtr = _682346561_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionProjectedShadowDrawOrder>()
      val hr = fn.invokeHR(arrayOf(__682346561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionProjectedShadowDrawOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DrawOrder(value: CompositionProjectedShadowDrawOrder?): Unit {
      val fnPtr = _682346561_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__682346561_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Mask(): CompositionBrush? {
      val fnPtr = _682346561_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__682346561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Mask(value: CompositionBrush?): Unit {
      val fnPtr = _682346561_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__682346561_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExpCompositionProjectedShadowReceiver_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __682346561_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpCompositionProjectedShadowReceiver, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85a2028b896b56a2896b5985ba7fb0cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpCompositionProjectedShadowReceiver(ptr: Pointer?): WithDefault =
        IExpCompositionProjectedShadowReceiver_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpCompositionProjectedShadowReceiver {
      val address = segment.toRawLongValue()
      return makeIExpCompositionProjectedShadowReceiver(Pointer(address))
    }

    public override fun toNative(obj: IExpCompositionProjectedShadowReceiver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__682346561_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpCompositionProjectedShadowReceiver):
        Array<IExpCompositionProjectedShadowReceiver?> = (elements as
        Array<IExpCompositionProjectedShadowReceiver?>).castToImpl<IExpCompositionProjectedShadowReceiver,IExpCompositionProjectedShadowReceiver_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpCompositionProjectedShadowReceiver?> =
        arrayOfNulls<IExpCompositionProjectedShadowReceiver_Impl>(size) as
        Array<IExpCompositionProjectedShadowReceiver?>
  }
}
