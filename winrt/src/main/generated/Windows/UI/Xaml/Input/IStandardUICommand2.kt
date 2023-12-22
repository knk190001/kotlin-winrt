package Windows.UI.Xaml.Input

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

@ABIMarker(IStandardUICommand2.ABI::class)
@Signature("{e3666069-f9e4-51eb-885b-7a620a0782ea}")
@Guid("e3666069f9e451eb885b7a620a0782ea")
@WinRTInterface("e3666069f9e451eb885b7a620a0782ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStandardUICommand2.ByReference::class)
public interface IStandardUICommand2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Kind(value: StandardUICommandKind?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStandardUICommand2> {
    public override fun getValue() = ABI.makeIStandardUICommand2(pointer.getPointer(0))

    public fun setValue(value: IStandardUICommand2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStandardUICommand2 {
    public val __1246009550_Ptr: Pointer?

    public val _1246009550_VtblPtr: Pointer?
      get() = __1246009550_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Kind(value: StandardUICommandKind?): Unit {
      val fnPtr = _1246009550_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1246009550_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStandardUICommand2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1246009550_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStandardUICommand2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3666069f9e451eb885b7a620a0782ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStandardUICommand2(ptr: Pointer?): WithDefault = IStandardUICommand2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStandardUICommand2 {
      val address = segment.toRawLongValue()
      return makeIStandardUICommand2(Pointer(address))
    }

    public override fun toNative(obj: IStandardUICommand2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1246009550_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStandardUICommand2): Array<IStandardUICommand2?> =
        (elements as
        Array<IStandardUICommand2?>).castToImpl<IStandardUICommand2,IStandardUICommand2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStandardUICommand2?> =
        arrayOfNulls<IStandardUICommand2_Impl>(size) as Array<IStandardUICommand2?>
  }
}
