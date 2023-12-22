package Windows.UI.Xaml.Markup

import Windows.UI.Xaml.Markup.IXamlType.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IXamlType2.ABI::class)
@Signature("{9f0c6e3b-433b-56ad-8f69-78a4dd3e64f9}")
@Guid("9f0c6e3b433b56ad8f6978a4dd3e64f9")
@WinRTInterface("9f0c6e3b433b56ad8f6978a4dd3e64f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlType2.ByReference::class)
public interface IXamlType2 : NativeMapped, IWinRTInterface, IXamlType {
  @InterfaceMethod(0)
  public fun get_BoxedType(): IXamlType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXamlType2> {
    public override fun getValue() = ABI.makeIXamlType2(pointer.getPointer(0))

    public fun setValue(value: IXamlType2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlType2, IXamlType.WithDefault {
    public val __400026854_Ptr: Pointer?

    public val _400026854_VtblPtr: Pointer?
      get() = __400026854_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BoxedType(): IXamlType? {
      val fnPtr = _400026854_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlType>()
      val hr = fn.invokeHR(arrayOf(__400026854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlType>(result.getValue())
      return resultValue
    }
  }

  public class IXamlType2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXamlType {
    public override val __1675472076_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_400026854_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __400026854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlType2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f0c6e3b433b56ad8f6978a4dd3e64f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlType2(ptr: Pointer?): WithDefault = IXamlType2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlType2 {
      val address = segment.toRawLongValue()
      return makeIXamlType2(Pointer(address))
    }

    public override fun toNative(obj: IXamlType2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__400026854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlType2): Array<IXamlType2?> = (elements as
        Array<IXamlType2?>).castToImpl<IXamlType2,IXamlType2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlType2?> = arrayOfNulls<IXamlType2_Impl>(size)
        as Array<IXamlType2?>
  }
}
