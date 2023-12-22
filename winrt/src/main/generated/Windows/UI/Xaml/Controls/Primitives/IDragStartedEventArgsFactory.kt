package Windows.UI.Xaml.Controls.Primitives

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDragStartedEventArgsFactory.ABI::class)
@Signature("{5eefe579-c706-4781-a308-c9e7f4c6a1d7}")
@Guid("5eefe579c7064781a308c9e7f4c6a1d7")
@WinRTInterface("5eefe579c7064781a308c9e7f4c6a1d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragStartedEventArgsFactory.ByReference::class)
public interface IDragStartedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithHorizontalOffsetAndVerticalOffset(
    horizontalOffset: Double,
    verticalOffset: Double,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): DragStartedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragStartedEventArgsFactory> {
    public override fun getValue() = ABI.makeIDragStartedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IDragStartedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragStartedEventArgsFactory {
    public val __1977083108_Ptr: Pointer?

    public val _1977083108_VtblPtr: Pointer?
      get() = __1977083108_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithHorizontalOffsetAndVerticalOffset(
      horizontalOffset: Double,
      verticalOffset: Double,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): DragStartedEventArgs? {
      val fnPtr = _1977083108_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragStartedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1977083108_Ptr, horizontalOffset, verticalOffset,
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragStartedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IDragStartedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1977083108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragStartedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5eefe579c7064781a308c9e7f4c6a1d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragStartedEventArgsFactory(ptr: Pointer?): WithDefault =
        IDragStartedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragStartedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIDragStartedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IDragStartedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1977083108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragStartedEventArgsFactory):
        Array<IDragStartedEventArgsFactory?> = (elements as
        Array<IDragStartedEventArgsFactory?>).castToImpl<IDragStartedEventArgsFactory,IDragStartedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragStartedEventArgsFactory?> =
        arrayOfNulls<IDragStartedEventArgsFactory_Impl>(size) as
        Array<IDragStartedEventArgsFactory?>
  }
}
