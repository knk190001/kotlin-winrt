package Windows.Devices.Perception.Provider

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IPerceptionControlGroup.ABI::class)
@Signature("{172c4882-2fd9-4c4e-ba34-fdf20a73dde5}")
@Guid("172c48822fd94c4eba34fdf20a73dde5")
@WinRTInterface("172c48822fd94c4eba34fdf20a73dde5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionControlGroup.ByReference::class)
public interface IPerceptionControlGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameProviderIds(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionControlGroup> {
    public override fun getValue() = ABI.makeIPerceptionControlGroup(pointer.getPointer(0))

    public fun setValue(value: IPerceptionControlGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionControlGroup {
    public val __1706241266_Ptr: Pointer?

    public val _1706241266_VtblPtr: Pointer?
      get() = __1706241266_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameProviderIds(): IVectorView<String?>? {
      val fnPtr = _1706241266_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1706241266_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionControlGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1706241266_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionControlGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("172c48822fd94c4eba34fdf20a73dde5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionControlGroup(ptr: Pointer?): WithDefault =
        IPerceptionControlGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionControlGroup {
      val address = segment.toRawLongValue()
      return makeIPerceptionControlGroup(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionControlGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1706241266_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionControlGroup): Array<IPerceptionControlGroup?>
        = (elements as
        Array<IPerceptionControlGroup?>).castToImpl<IPerceptionControlGroup,IPerceptionControlGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionControlGroup?> =
        arrayOfNulls<IPerceptionControlGroup_Impl>(size) as Array<IPerceptionControlGroup?>
  }
}
