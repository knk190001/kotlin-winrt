package Windows.UI.Input.Spatial

import Windows.Perception.Spatial.SpatialCoordinateSystem
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialNavigationStartedEventArgs.ABI::class)
@Signature("{754a348a-fb64-4656-8ebd-9deecaafe475}")
@Guid("754a348afb6446568ebd9deecaafe475")
@WinRTInterface("754a348afb6446568ebd9deecaafe475")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialNavigationStartedEventArgs.ByReference::class)
public interface ISpatialNavigationStartedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  @InterfaceMethod(1)
  public fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?): SpatialPointerPose?

  @InterfaceMethod(2)
  public fun get_IsNavigatingX(): Boolean

  @InterfaceMethod(3)
  public fun get_IsNavigatingY(): Boolean

  @InterfaceMethod(4)
  public fun get_IsNavigatingZ(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialNavigationStartedEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialNavigationStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialNavigationStartedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialNavigationStartedEventArgs {
    public val __1272676054_Ptr: Pointer?

    public val _1272676054_VtblPtr: Pointer?
      get() = __1272676054_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _1272676054_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__1272676054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?):
        SpatialPointerPose? {
      val fnPtr = _1272676054_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialPointerPose>()
      val hr = fn.invokeHR(arrayOf(__1272676054_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialPointerPose>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsNavigatingX(): Boolean {
      val fnPtr = _1272676054_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1272676054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsNavigatingY(): Boolean {
      val fnPtr = _1272676054_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1272676054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsNavigatingZ(): Boolean {
      val fnPtr = _1272676054_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1272676054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpatialNavigationStartedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1272676054_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialNavigationStartedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("754a348afb6446568ebd9deecaafe475")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialNavigationStartedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialNavigationStartedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialNavigationStartedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialNavigationStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialNavigationStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1272676054_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialNavigationStartedEventArgs):
        Array<ISpatialNavigationStartedEventArgs?> = (elements as
        Array<ISpatialNavigationStartedEventArgs?>).castToImpl<ISpatialNavigationStartedEventArgs,ISpatialNavigationStartedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialNavigationStartedEventArgs?> =
        arrayOfNulls<ISpatialNavigationStartedEventArgs_Impl>(size) as
        Array<ISpatialNavigationStartedEventArgs?>
  }
}
