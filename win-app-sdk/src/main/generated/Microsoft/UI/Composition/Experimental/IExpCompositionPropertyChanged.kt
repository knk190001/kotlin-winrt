package Microsoft.UI.Composition.Experimental

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

@ABIMarker(IExpCompositionPropertyChanged.ABI::class)
@Signature("{12b579a9-6a27-5cde-a2a1-c557bb7dfdb3}")
@Guid("12b579a96a275cdea2a1c557bb7dfdb3")
@WinRTInterface("12b579a96a275cdea2a1c557bb7dfdb3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpCompositionPropertyChanged.ByReference::class)
public interface IExpCompositionPropertyChanged : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetPropertyChangedListener(`property`: ExpExpressionNotificationProperty?,
      listener: IExpCompositionPropertyChangedListener?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpCompositionPropertyChanged> {
    public override fun getValue() = ABI.makeIExpCompositionPropertyChanged(pointer.getPointer(0))

    public fun setValue(value: IExpCompositionPropertyChanged_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpCompositionPropertyChanged {
    public val __776529327_Ptr: Pointer?

    public val _776529327_VtblPtr: Pointer?
      get() = __776529327_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetPropertyChangedListener(`property`: ExpExpressionNotificationProperty?,
        listener: IExpCompositionPropertyChangedListener?): Unit {
      val fnPtr = _776529327_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__776529327_Ptr, marshalToNative(property),
          marshalToNative(listener),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExpCompositionPropertyChanged_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __776529327_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpCompositionPropertyChanged, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12b579a96a275cdea2a1c557bb7dfdb3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpCompositionPropertyChanged(ptr: Pointer?): WithDefault =
        IExpCompositionPropertyChanged_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpCompositionPropertyChanged {
      val address = segment.toRawLongValue()
      return makeIExpCompositionPropertyChanged(Pointer(address))
    }

    public override fun toNative(obj: IExpCompositionPropertyChanged): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__776529327_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpCompositionPropertyChanged):
        Array<IExpCompositionPropertyChanged?> = (elements as
        Array<IExpCompositionPropertyChanged?>).castToImpl<IExpCompositionPropertyChanged,IExpCompositionPropertyChanged_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpCompositionPropertyChanged?> =
        arrayOfNulls<IExpCompositionPropertyChanged_Impl>(size) as
        Array<IExpCompositionPropertyChanged?>
  }
}
