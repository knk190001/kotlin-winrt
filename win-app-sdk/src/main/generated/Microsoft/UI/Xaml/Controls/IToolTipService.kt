package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToolTipService.ABI::class)
@Signature("{01140768-2727-5f89-80e0-5210326a3431}")
@Guid("0114076827275f8980e05210326a3431")
@WinRTInterface("0114076827275f8980e05210326a3431")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToolTipService.ByReference::class)
public interface IToolTipService : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToolTipService> {
    public override fun getValue() = ABI.makeIToolTipService(pointer.getPointer(0))

    public fun setValue(value: IToolTipService_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToolTipService {
    public val __178820825_Ptr: Pointer?

    public val _178820825_VtblPtr: Pointer?
      get() = __178820825_Ptr?.getPointer(0)
  }

  public class IToolTipService_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __178820825_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToolTipService, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0114076827275f8980e05210326a3431")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToolTipService(ptr: Pointer?): WithDefault = IToolTipService_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToolTipService {
      val address = segment.toRawLongValue()
      return makeIToolTipService(Pointer(address))
    }

    public override fun toNative(obj: IToolTipService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__178820825_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToolTipService): Array<IToolTipService?> = (elements as
        Array<IToolTipService?>).castToImpl<IToolTipService,IToolTipService_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToolTipService?> =
        arrayOfNulls<IToolTipService_Impl>(size) as Array<IToolTipService?>
  }
}
