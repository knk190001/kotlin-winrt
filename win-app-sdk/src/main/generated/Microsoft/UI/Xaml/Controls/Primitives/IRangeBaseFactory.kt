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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRangeBaseFactory.ABI::class)
@Signature("{41c205e2-4422-5dca-9b49-e31210ea396c}")
@Guid("41c205e244225dca9b49e31210ea396c")
@WinRTInterface("41c205e244225dca9b49e31210ea396c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRangeBaseFactory.ByReference::class)
public interface IRangeBaseFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): RangeBase?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRangeBaseFactory> {
    public override fun getValue() = ABI.makeIRangeBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IRangeBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRangeBaseFactory {
    public val __128366131_Ptr: Pointer?

    public val _128366131_VtblPtr: Pointer?
      get() = __128366131_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RangeBase? {
      val fnPtr = _128366131_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RangeBase>()
      val hr = fn.invokeHR(arrayOf(__128366131_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RangeBase>(result.getValue())
      return resultValue
    }
  }

  public class IRangeBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __128366131_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRangeBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41c205e244225dca9b49e31210ea396c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRangeBaseFactory(ptr: Pointer?): WithDefault = IRangeBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRangeBaseFactory {
      val address = segment.toRawLongValue()
      return makeIRangeBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IRangeBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__128366131_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRangeBaseFactory): Array<IRangeBaseFactory?> = (elements
        as Array<IRangeBaseFactory?>).castToImpl<IRangeBaseFactory,IRangeBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRangeBaseFactory?> =
        arrayOfNulls<IRangeBaseFactory_Impl>(size) as Array<IRangeBaseFactory?>
  }
}
