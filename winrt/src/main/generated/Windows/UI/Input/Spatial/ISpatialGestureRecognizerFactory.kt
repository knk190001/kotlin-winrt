package Windows.UI.Input.Spatial

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

@ABIMarker(ISpatialGestureRecognizerFactory.ABI::class)
@Signature("{77214186-57b9-3150-8382-698b24e264d0}")
@Guid("7721418657b931508382698b24e264d0")
@WinRTInterface("7721418657b931508382698b24e264d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialGestureRecognizerFactory.ByReference::class)
public interface ISpatialGestureRecognizerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(settings: SpatialGestureSettings?): SpatialGestureRecognizer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialGestureRecognizerFactory> {
    public override fun getValue() = ABI.makeISpatialGestureRecognizerFactory(pointer.getPointer(0))

    public fun setValue(value: ISpatialGestureRecognizerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialGestureRecognizerFactory {
    public val __661623543_Ptr: Pointer?

    public val _661623543_VtblPtr: Pointer?
      get() = __661623543_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(settings: SpatialGestureSettings?): SpatialGestureRecognizer? {
      val fnPtr = _661623543_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialGestureRecognizer>()
      val hr = fn.invokeHR(arrayOf(__661623543_Ptr, marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialGestureRecognizer>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialGestureRecognizerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __661623543_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialGestureRecognizerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7721418657b931508382698b24e264d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialGestureRecognizerFactory(ptr: Pointer?): WithDefault =
        ISpatialGestureRecognizerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialGestureRecognizerFactory {
      val address = segment.toRawLongValue()
      return makeISpatialGestureRecognizerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISpatialGestureRecognizerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__661623543_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialGestureRecognizerFactory):
        Array<ISpatialGestureRecognizerFactory?> = (elements as
        Array<ISpatialGestureRecognizerFactory?>).castToImpl<ISpatialGestureRecognizerFactory,ISpatialGestureRecognizerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialGestureRecognizerFactory?> =
        arrayOfNulls<ISpatialGestureRecognizerFactory_Impl>(size) as
        Array<ISpatialGestureRecognizerFactory?>
  }
}
