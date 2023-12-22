package Windows.UI.Input.Inking

import Windows.Foundation.Point
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkPointFactory.ABI::class)
@Signature("{29e5d51c-c98f-405d-9f3b-e53e31068d4d}")
@Guid("29e5d51cc98f405d9f3be53e31068d4d")
@WinRTInterface("29e5d51cc98f405d9f3be53e31068d4d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPointFactory.ByReference::class)
public interface IInkPointFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInkPoint(position: Point?, pressure: Float): InkPoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkPointFactory> {
    public override fun getValue() = ABI.makeIInkPointFactory(pointer.getPointer(0))

    public fun setValue(value: IInkPointFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPointFactory {
    public val __1349925766_Ptr: Pointer?

    public val _1349925766_VtblPtr: Pointer?
      get() = __1349925766_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInkPoint(position: Point?, pressure: Float): InkPoint? {
      val fnPtr = _1349925766_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPoint>()
      val hr = fn.invokeHR(arrayOf(__1349925766_Ptr, marshalToNative(position), pressure, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPoint>(result.getValue())
      return resultValue
    }
  }

  public class IInkPointFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1349925766_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPointFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29e5d51cc98f405d9f3be53e31068d4d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPointFactory(ptr: Pointer?): WithDefault = IInkPointFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPointFactory {
      val address = segment.toRawLongValue()
      return makeIInkPointFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkPointFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1349925766_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPointFactory): Array<IInkPointFactory?> = (elements as
        Array<IInkPointFactory?>).castToImpl<IInkPointFactory,IInkPointFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPointFactory?> =
        arrayOfNulls<IInkPointFactory_Impl>(size) as Array<IInkPointFactory?>
  }
}
