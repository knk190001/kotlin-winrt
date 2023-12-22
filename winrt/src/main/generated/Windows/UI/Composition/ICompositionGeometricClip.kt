package Windows.UI.Composition

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

@ABIMarker(ICompositionGeometricClip.ABI::class)
@Signature("{c840b581-81c9-4444-a2c1-ccaece3a50e5}")
@Guid("c840b58181c94444a2c1ccaece3a50e5")
@WinRTInterface("c840b58181c94444a2c1ccaece3a50e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionGeometricClip.ByReference::class)
public interface ICompositionGeometricClip : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Geometry(): CompositionGeometry?

  @InterfaceMethod(1)
  public fun put_Geometry(value: CompositionGeometry?): Unit

  @InterfaceMethod(2)
  public fun get_ViewBox(): CompositionViewBox?

  @InterfaceMethod(3)
  public fun put_ViewBox(value: CompositionViewBox?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionGeometricClip> {
    public override fun getValue() = ABI.makeICompositionGeometricClip(pointer.getPointer(0))

    public fun setValue(value: ICompositionGeometricClip_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionGeometricClip {
    public val __143262891_Ptr: Pointer?

    public val _143262891_VtblPtr: Pointer?
      get() = __143262891_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Geometry(): CompositionGeometry? {
      val fnPtr = _143262891_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGeometry>()
      val hr = fn.invokeHR(arrayOf(__143262891_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGeometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Geometry(value: CompositionGeometry?): Unit {
      val fnPtr = _143262891_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__143262891_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ViewBox(): CompositionViewBox? {
      val fnPtr = _143262891_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionViewBox>()
      val hr = fn.invokeHR(arrayOf(__143262891_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionViewBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ViewBox(value: CompositionViewBox?): Unit {
      val fnPtr = _143262891_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__143262891_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionGeometricClip_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __143262891_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionGeometricClip, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c840b58181c94444a2c1ccaece3a50e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionGeometricClip(ptr: Pointer?): WithDefault =
        ICompositionGeometricClip_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionGeometricClip {
      val address = segment.toRawLongValue()
      return makeICompositionGeometricClip(Pointer(address))
    }

    public override fun toNative(obj: ICompositionGeometricClip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__143262891_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionGeometricClip):
        Array<ICompositionGeometricClip?> = (elements as
        Array<ICompositionGeometricClip?>).castToImpl<ICompositionGeometricClip,ICompositionGeometricClip_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionGeometricClip?> =
        arrayOfNulls<ICompositionGeometricClip_Impl>(size) as Array<ICompositionGeometricClip?>
  }
}
