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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDragDeltaEventArgsFactory.ABI::class)
@Signature("{4adba280-e1f9-5dab-87ff-5903b419ef9d}")
@Guid("4adba280e1f95dab87ff5903b419ef9d")
@WinRTInterface("4adba280e1f95dab87ff5903b419ef9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragDeltaEventArgsFactory.ByReference::class)
public interface IDragDeltaEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithHorizontalChangeAndVerticalChange(
    horizontalChange: Double,
    verticalChange: Double,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): DragDeltaEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragDeltaEventArgsFactory> {
    public override fun getValue() = ABI.makeIDragDeltaEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IDragDeltaEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragDeltaEventArgsFactory {
    public val __587857478_Ptr: Pointer?

    public val _587857478_VtblPtr: Pointer?
      get() = __587857478_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithHorizontalChangeAndVerticalChange(
      horizontalChange: Double,
      verticalChange: Double,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): DragDeltaEventArgs? {
      val fnPtr = _587857478_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragDeltaEventArgs>()
      val hr = fn.invokeHR(arrayOf(__587857478_Ptr, horizontalChange, verticalChange,
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragDeltaEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IDragDeltaEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __587857478_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragDeltaEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4adba280e1f95dab87ff5903b419ef9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragDeltaEventArgsFactory(ptr: Pointer?): WithDefault =
        IDragDeltaEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragDeltaEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIDragDeltaEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IDragDeltaEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__587857478_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragDeltaEventArgsFactory):
        Array<IDragDeltaEventArgsFactory?> = (elements as
        Array<IDragDeltaEventArgsFactory?>).castToImpl<IDragDeltaEventArgsFactory,IDragDeltaEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragDeltaEventArgsFactory?> =
        arrayOfNulls<IDragDeltaEventArgsFactory_Impl>(size) as Array<IDragDeltaEventArgsFactory?>
  }
}
