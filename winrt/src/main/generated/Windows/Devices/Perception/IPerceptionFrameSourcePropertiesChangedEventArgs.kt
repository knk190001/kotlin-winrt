package Windows.Devices.Perception

import Windows.Foundation.Collections.CollectionChange
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

@ABIMarker(IPerceptionFrameSourcePropertiesChangedEventArgs.ABI::class)
@Signature("{6c68e068-bcf1-4ecc-b891-7625d1244b6b}")
@Guid("6c68e068bcf14eccb8917625d1244b6b")
@WinRTInterface("6c68e068bcf14eccb8917625d1244b6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionFrameSourcePropertiesChangedEventArgs.ByReference::class)
public interface IPerceptionFrameSourcePropertiesChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CollectionChange(): CollectionChange?

  @InterfaceMethod(1)
  public fun get_Key(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionFrameSourcePropertiesChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIPerceptionFrameSourcePropertiesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPerceptionFrameSourcePropertiesChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionFrameSourcePropertiesChangedEventArgs {
    public val __1828931471_Ptr: Pointer?

    public val _1828931471_VtblPtr: Pointer?
      get() = __1828931471_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CollectionChange(): CollectionChange? {
      val fnPtr = _1828931471_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CollectionChange>()
      val hr = fn.invokeHR(arrayOf(__1828931471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CollectionChange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Key(): String? {
      val fnPtr = _1828931471_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1828931471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionFrameSourcePropertiesChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1828931471_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionFrameSourcePropertiesChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6c68e068bcf14eccb8917625d1244b6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionFrameSourcePropertiesChangedEventArgs(ptr: Pointer?): WithDefault =
        IPerceptionFrameSourcePropertiesChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionFrameSourcePropertiesChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPerceptionFrameSourcePropertiesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionFrameSourcePropertiesChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1828931471_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionFrameSourcePropertiesChangedEventArgs):
        Array<IPerceptionFrameSourcePropertiesChangedEventArgs?> = (elements as
        Array<IPerceptionFrameSourcePropertiesChangedEventArgs?>).castToImpl<IPerceptionFrameSourcePropertiesChangedEventArgs,IPerceptionFrameSourcePropertiesChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionFrameSourcePropertiesChangedEventArgs?>
        = arrayOfNulls<IPerceptionFrameSourcePropertiesChangedEventArgs_Impl>(size) as
        Array<IPerceptionFrameSourcePropertiesChangedEventArgs?>
  }
}
