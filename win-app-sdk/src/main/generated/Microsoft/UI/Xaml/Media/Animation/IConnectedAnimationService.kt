package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Composition.CompositionEasingFunction
import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.TimeSpan
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

@ABIMarker(IConnectedAnimationService.ABI::class)
@Signature("{85f72163-c3c8-586a-91fe-3e0315a3a4fc}")
@Guid("85f72163c3c8586a91fe3e0315a3a4fc")
@WinRTInterface("85f72163c3c8586a91fe3e0315a3a4fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectedAnimationService.ByReference::class)
public interface IConnectedAnimationService : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DefaultDuration(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_DefaultDuration(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_DefaultEasingFunction(): CompositionEasingFunction?

  @InterfaceMethod(3)
  public fun put_DefaultEasingFunction(value: CompositionEasingFunction?): Unit

  @InterfaceMethod(4)
  public fun PrepareToAnimate(key: String?, source: UIElement?): ConnectedAnimation?

  @InterfaceMethod(5)
  public fun GetAnimation(key: String?): ConnectedAnimation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectedAnimationService> {
    public override fun getValue() = ABI.makeIConnectedAnimationService(pointer.getPointer(0))

    public fun setValue(value: IConnectedAnimationService_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectedAnimationService {
    public val __684851681_Ptr: Pointer?

    public val _684851681_VtblPtr: Pointer?
      get() = __684851681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DefaultDuration(): TimeSpan? {
      val fnPtr = _684851681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__684851681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DefaultDuration(value: TimeSpan?): Unit {
      val fnPtr = _684851681_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__684851681_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DefaultEasingFunction(): CompositionEasingFunction? {
      val fnPtr = _684851681_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__684851681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DefaultEasingFunction(value: CompositionEasingFunction?): Unit {
      val fnPtr = _684851681_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__684851681_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun PrepareToAnimate(key: String?, source: UIElement?): ConnectedAnimation? {
      val fnPtr = _684851681_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectedAnimation>()
      val hr = fn.invokeHR(arrayOf(__684851681_Ptr, marshalToNative(key), marshalToNative(source),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectedAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetAnimation(key: String?): ConnectedAnimation? {
      val fnPtr = _684851681_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectedAnimation>()
      val hr = fn.invokeHR(arrayOf(__684851681_Ptr, marshalToNative(key), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectedAnimation>(result.getValue())
      return resultValue
    }
  }

  public class IConnectedAnimationService_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __684851681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectedAnimationService, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85f72163c3c8586a91fe3e0315a3a4fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectedAnimationService(ptr: Pointer?): WithDefault =
        IConnectedAnimationService_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectedAnimationService {
      val address = segment.toRawLongValue()
      return makeIConnectedAnimationService(Pointer(address))
    }

    public override fun toNative(obj: IConnectedAnimationService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__684851681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectedAnimationService):
        Array<IConnectedAnimationService?> = (elements as
        Array<IConnectedAnimationService?>).castToImpl<IConnectedAnimationService,IConnectedAnimationService_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectedAnimationService?> =
        arrayOfNulls<IConnectedAnimationService_Impl>(size) as Array<IConnectedAnimationService?>
  }
}
