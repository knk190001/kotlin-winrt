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

@ABIMarker(IScrollSnapPointFactory.ABI::class)
@Signature("{39304bc7-0e54-5c06-8920-adcf67e7c466}")
@Guid("39304bc70e545c068920adcf67e7c466")
@WinRTInterface("39304bc70e545c068920adcf67e7c466")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollSnapPointFactory.ByReference::class)
public interface IScrollSnapPointFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    snapPointValue: Double,
    alignment: ScrollSnapPointsAlignment?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ScrollSnapPoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollSnapPointFactory> {
    public override fun getValue() = ABI.makeIScrollSnapPointFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollSnapPointFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollSnapPointFactory {
    public val __1264413502_Ptr: Pointer?

    public val _1264413502_VtblPtr: Pointer?
      get() = __1264413502_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      snapPointValue: Double,
      alignment: ScrollSnapPointsAlignment?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ScrollSnapPoint? {
      val fnPtr = _1264413502_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollSnapPoint>()
      val hr = fn.invokeHR(arrayOf(__1264413502_Ptr, snapPointValue, marshalToNative(alignment),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollSnapPoint>(result.getValue())
      return resultValue
    }
  }

  public class IScrollSnapPointFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1264413502_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollSnapPointFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("39304bc70e545c068920adcf67e7c466")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollSnapPointFactory(ptr: Pointer?): WithDefault =
        IScrollSnapPointFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollSnapPointFactory {
      val address = segment.toRawLongValue()
      return makeIScrollSnapPointFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollSnapPointFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1264413502_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollSnapPointFactory): Array<IScrollSnapPointFactory?>
        = (elements as
        Array<IScrollSnapPointFactory?>).castToImpl<IScrollSnapPointFactory,IScrollSnapPointFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollSnapPointFactory?> =
        arrayOfNulls<IScrollSnapPointFactory_Impl>(size) as Array<IScrollSnapPointFactory?>
  }
}
