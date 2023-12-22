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

@ABIMarker(IRepeatedScrollSnapPointFactory.ABI::class)
@Signature("{f2fd8403-679e-5c31-b431-72a0e0014e6a}")
@Guid("f2fd8403679e5c31b43172a0e0014e6a")
@WinRTInterface("f2fd8403679e5c31b43172a0e0014e6a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepeatedScrollSnapPointFactory.ByReference::class)
public interface IRepeatedScrollSnapPointFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    offset: Double,
    interval: Double,
    start: Double,
    end: Double,
    alignment: ScrollSnapPointsAlignment?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): RepeatedScrollSnapPoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepeatedScrollSnapPointFactory> {
    public override fun getValue() = ABI.makeIRepeatedScrollSnapPointFactory(pointer.getPointer(0))

    public fun setValue(value: IRepeatedScrollSnapPointFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepeatedScrollSnapPointFactory {
    public val __1631442980_Ptr: Pointer?

    public val _1631442980_VtblPtr: Pointer?
      get() = __1631442980_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      offset: Double,
      interval: Double,
      start: Double,
      end: Double,
      alignment: ScrollSnapPointsAlignment?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): RepeatedScrollSnapPoint? {
      val fnPtr = _1631442980_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RepeatedScrollSnapPoint>()
      val hr = fn.invokeHR(arrayOf(__1631442980_Ptr, offset, interval, start, end,
          marshalToNative(alignment), marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RepeatedScrollSnapPoint>(result.getValue())
      return resultValue
    }
  }

  public class IRepeatedScrollSnapPointFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1631442980_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepeatedScrollSnapPointFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2fd8403679e5c31b43172a0e0014e6a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepeatedScrollSnapPointFactory(ptr: Pointer?): WithDefault =
        IRepeatedScrollSnapPointFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepeatedScrollSnapPointFactory {
      val address = segment.toRawLongValue()
      return makeIRepeatedScrollSnapPointFactory(Pointer(address))
    }

    public override fun toNative(obj: IRepeatedScrollSnapPointFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1631442980_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepeatedScrollSnapPointFactory):
        Array<IRepeatedScrollSnapPointFactory?> = (elements as
        Array<IRepeatedScrollSnapPointFactory?>).castToImpl<IRepeatedScrollSnapPointFactory,IRepeatedScrollSnapPointFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepeatedScrollSnapPointFactory?> =
        arrayOfNulls<IRepeatedScrollSnapPointFactory_Impl>(size) as
        Array<IRepeatedScrollSnapPointFactory?>
  }
}
