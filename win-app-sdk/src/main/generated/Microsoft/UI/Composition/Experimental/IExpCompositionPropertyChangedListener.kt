package Microsoft.UI.Composition.Experimental

import Microsoft.UI.Composition.CompositionObject
import Windows.Foundation.Numerics.Matrix3x2
import Windows.Foundation.Numerics.Matrix4x4
import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.Numerics.Vector4
import Windows.UI.Color
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExpCompositionPropertyChangedListener.ABI::class)
@Signature("{5f9c3d96-1e77-5980-8b28-7a9b8614a863}")
@Guid("5f9c3d961e7759808b287a9b8614a863")
@WinRTInterface("5f9c3d961e7759808b287a9b8614a863")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpCompositionPropertyChangedListener.ByReference::class)
public interface IExpCompositionPropertyChangedListener : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun NotifyBooleanPropertyChanged(
    target: CompositionObject?,
    `property`: ExpExpressionNotificationProperty?,
    value: Boolean
  ): Unit

  @InterfaceMethod(1)
  public fun NotifyColorPropertyChanged(
    target: CompositionObject?,
    `property`: ExpExpressionNotificationProperty?,
    value: Color?
  ): Unit

  @InterfaceMethod(2)
  public fun NotifyMatrix3x2PropertyChanged(
    target: CompositionObject?,
    `property`: ExpExpressionNotificationProperty?,
    value: Matrix3x2?
  ): Unit

  @InterfaceMethod(3)
  public fun NotifyMatrix4x4PropertyChanged(
    target: CompositionObject?,
    `property`: ExpExpressionNotificationProperty?,
    value: Matrix4x4?
  ): Unit

  @InterfaceMethod(4)
  public fun NotifyReferencePropertyChanged(target: CompositionObject?,
      `property`: ExpExpressionNotificationProperty?): Unit

  @InterfaceMethod(5)
  public fun NotifySinglePropertyChanged(
    target: CompositionObject?,
    `property`: ExpExpressionNotificationProperty?,
    value: Float
  ): Unit

  @InterfaceMethod(6)
  public fun NotifyVector2PropertyChanged(
    target: CompositionObject?,
    `property`: ExpExpressionNotificationProperty?,
    value: Vector2?
  ): Unit

  @InterfaceMethod(7)
  public fun NotifyVector3PropertyChanged(
    target: CompositionObject?,
    `property`: ExpExpressionNotificationProperty?,
    value: Vector3?
  ): Unit

  @InterfaceMethod(8)
  public fun NotifyVector4PropertyChanged(
    target: CompositionObject?,
    `property`: ExpExpressionNotificationProperty?,
    value: Vector4?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpCompositionPropertyChangedListener> {
    public override fun getValue() =
        ABI.makeIExpCompositionPropertyChangedListener(pointer.getPointer(0))

    public fun setValue(value: IExpCompositionPropertyChangedListener_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpCompositionPropertyChangedListener {
    public val __1282600835_Ptr: Pointer?

    public val _1282600835_VtblPtr: Pointer?
      get() = __1282600835_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun NotifyBooleanPropertyChanged(
      target: CompositionObject?,
      `property`: ExpExpressionNotificationProperty?,
      value: Boolean
    ): Unit {
      val fnPtr = _1282600835_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282600835_Ptr, marshalToNative(target),
          marshalToNative(property), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun NotifyColorPropertyChanged(
      target: CompositionObject?,
      `property`: ExpExpressionNotificationProperty?,
      value: Color?
    ): Unit {
      val fnPtr = _1282600835_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282600835_Ptr, marshalToNative(target),
          marshalToNative(property), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun NotifyMatrix3x2PropertyChanged(
      target: CompositionObject?,
      `property`: ExpExpressionNotificationProperty?,
      value: Matrix3x2?
    ): Unit {
      val fnPtr = _1282600835_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282600835_Ptr, marshalToNative(target),
          marshalToNative(property), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun NotifyMatrix4x4PropertyChanged(
      target: CompositionObject?,
      `property`: ExpExpressionNotificationProperty?,
      value: Matrix4x4?
    ): Unit {
      val fnPtr = _1282600835_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282600835_Ptr, marshalToNative(target),
          marshalToNative(property), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun NotifyReferencePropertyChanged(target: CompositionObject?,
        `property`: ExpExpressionNotificationProperty?): Unit {
      val fnPtr = _1282600835_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282600835_Ptr, marshalToNative(target),
          marshalToNative(property),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun NotifySinglePropertyChanged(
      target: CompositionObject?,
      `property`: ExpExpressionNotificationProperty?,
      value: Float
    ): Unit {
      val fnPtr = _1282600835_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282600835_Ptr, marshalToNative(target),
          marshalToNative(property), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun NotifyVector2PropertyChanged(
      target: CompositionObject?,
      `property`: ExpExpressionNotificationProperty?,
      value: Vector2?
    ): Unit {
      val fnPtr = _1282600835_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282600835_Ptr, marshalToNative(target),
          marshalToNative(property), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun NotifyVector3PropertyChanged(
      target: CompositionObject?,
      `property`: ExpExpressionNotificationProperty?,
      value: Vector3?
    ): Unit {
      val fnPtr = _1282600835_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282600835_Ptr, marshalToNative(target),
          marshalToNative(property), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun NotifyVector4PropertyChanged(
      target: CompositionObject?,
      `property`: ExpExpressionNotificationProperty?,
      value: Vector4?
    ): Unit {
      val fnPtr = _1282600835_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282600835_Ptr, marshalToNative(target),
          marshalToNative(property), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExpCompositionPropertyChangedListener_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1282600835_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpCompositionPropertyChangedListener, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f9c3d961e7759808b287a9b8614a863")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpCompositionPropertyChangedListener(ptr: Pointer?): WithDefault =
        IExpCompositionPropertyChangedListener_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpCompositionPropertyChangedListener {
      val address = segment.toRawLongValue()
      return makeIExpCompositionPropertyChangedListener(Pointer(address))
    }

    public override fun toNative(obj: IExpCompositionPropertyChangedListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1282600835_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpCompositionPropertyChangedListener):
        Array<IExpCompositionPropertyChangedListener?> = (elements as
        Array<IExpCompositionPropertyChangedListener?>).castToImpl<IExpCompositionPropertyChangedListener,IExpCompositionPropertyChangedListener_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpCompositionPropertyChangedListener?> =
        arrayOfNulls<IExpCompositionPropertyChangedListener_Impl>(size) as
        Array<IExpCompositionPropertyChangedListener?>
  }
}
