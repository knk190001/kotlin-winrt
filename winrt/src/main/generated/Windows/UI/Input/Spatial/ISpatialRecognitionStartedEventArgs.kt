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

@ABIMarker(ISpatialRecognitionStartedEventArgs.ABI::class)
@Signature("{24da128f-0008-4a6d-aa50-2a76f9cfb264}")
@Guid("24da128f00084a6daa502a76f9cfb264")
@WinRTInterface("24da128f00084a6daa502a76f9cfb264")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialRecognitionStartedEventArgs.ByReference::class)
public interface ISpatialRecognitionStartedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  @InterfaceMethod(1)
  public fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?): SpatialPointerPose?

  @InterfaceMethod(2)
  public fun IsGesturePossible(gesture: SpatialGestureSettings?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialRecognitionStartedEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialRecognitionStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialRecognitionStartedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialRecognitionStartedEventArgs {
    public val __528038687_Ptr: Pointer?

    public val _528038687_VtblPtr: Pointer?
      get() = __528038687_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _528038687_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__528038687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?):
        SpatialPointerPose? {
      val fnPtr = _528038687_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialPointerPose>()
      val hr = fn.invokeHR(arrayOf(__528038687_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialPointerPose>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun IsGesturePossible(gesture: SpatialGestureSettings?): Boolean {
      val fnPtr = _528038687_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__528038687_Ptr, marshalToNative(gesture), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpatialRecognitionStartedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __528038687_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialRecognitionStartedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24da128f00084a6daa502a76f9cfb264")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialRecognitionStartedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialRecognitionStartedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialRecognitionStartedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialRecognitionStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialRecognitionStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__528038687_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialRecognitionStartedEventArgs):
        Array<ISpatialRecognitionStartedEventArgs?> = (elements as
        Array<ISpatialRecognitionStartedEventArgs?>).castToImpl<ISpatialRecognitionStartedEventArgs,ISpatialRecognitionStartedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialRecognitionStartedEventArgs?> =
        arrayOfNulls<ISpatialRecognitionStartedEventArgs_Impl>(size) as
        Array<ISpatialRecognitionStartedEventArgs?>
  }
}
