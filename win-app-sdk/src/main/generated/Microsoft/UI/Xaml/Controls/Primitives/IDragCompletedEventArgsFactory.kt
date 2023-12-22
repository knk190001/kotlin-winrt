package Microsoft.UI.Xaml.Controls.Primitives

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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDragCompletedEventArgsFactory.ABI::class)
@Signature("{5767c408-454b-55cf-b74e-229642aed108}")
@Guid("5767c408454b55cfb74e229642aed108")
@WinRTInterface("5767c408454b55cfb74e229642aed108")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragCompletedEventArgsFactory.ByReference::class)
public interface IDragCompletedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithHorizontalChangeVerticalChangeAndCanceled(
    horizontalChange: Double,
    verticalChange: Double,
    canceled: Boolean,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): DragCompletedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragCompletedEventArgsFactory> {
    public override fun getValue() = ABI.makeIDragCompletedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IDragCompletedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragCompletedEventArgsFactory {
    public val __1629078183_Ptr: Pointer?

    public val _1629078183_VtblPtr: Pointer?
      get() = __1629078183_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithHorizontalChangeVerticalChangeAndCanceled(
      horizontalChange: Double,
      verticalChange: Double,
      canceled: Boolean,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): DragCompletedEventArgs? {
      val fnPtr = _1629078183_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragCompletedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1629078183_Ptr, horizontalChange, verticalChange, canceled,
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragCompletedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IDragCompletedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1629078183_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragCompletedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5767c408454b55cfb74e229642aed108")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragCompletedEventArgsFactory(ptr: Pointer?): WithDefault =
        IDragCompletedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragCompletedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIDragCompletedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IDragCompletedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1629078183_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragCompletedEventArgsFactory):
        Array<IDragCompletedEventArgsFactory?> = (elements as
        Array<IDragCompletedEventArgsFactory?>).castToImpl<IDragCompletedEventArgsFactory,IDragCompletedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragCompletedEventArgsFactory?> =
        arrayOfNulls<IDragCompletedEventArgsFactory_Impl>(size) as
        Array<IDragCompletedEventArgsFactory?>
  }
}
