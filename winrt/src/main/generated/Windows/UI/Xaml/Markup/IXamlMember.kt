package Windows.UI.Xaml.Markup

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlMember.ABI::class)
@Signature("{c541f58c-43a9-4216-b718-e0b11b14e93e}")
@Guid("c541f58c43a94216b718e0b11b14e93e")
@WinRTInterface("c541f58c43a94216b718e0b11b14e93e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlMember.ByReference::class)
public interface IXamlMember : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsAttachable(): Boolean

  @InterfaceMethod(1)
  public fun get_IsDependencyProperty(): Boolean

  @InterfaceMethod(2)
  public fun get_IsReadOnly(): Boolean

  @InterfaceMethod(3)
  public fun get_Name(): String?

  @InterfaceMethod(4)
  public fun get_TargetType(): IXamlType?

  @InterfaceMethod(5)
  public fun get_Type(): IXamlType?

  @InterfaceMethod(6)
  public fun GetValue(instance: IUnknown?): IUnknown?

  @InterfaceMethod(7)
  public fun SetValue(instance: IUnknown?, value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXamlMember> {
    public override fun getValue() = ABI.makeIXamlMember(pointer.getPointer(0))

    public fun setValue(value: IXamlMember_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlMember {
    public val __703034452_Ptr: Pointer?

    public val _703034452_VtblPtr: Pointer?
      get() = __703034452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsAttachable(): Boolean {
      val fnPtr = _703034452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__703034452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsDependencyProperty(): Boolean {
      val fnPtr = _703034452_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__703034452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsReadOnly(): Boolean {
      val fnPtr = _703034452_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__703034452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Name(): String? {
      val fnPtr = _703034452_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__703034452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TargetType(): IXamlType? {
      val fnPtr = _703034452_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlType>()
      val hr = fn.invokeHR(arrayOf(__703034452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Type(): IXamlType? {
      val fnPtr = _703034452_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlType>()
      val hr = fn.invokeHR(arrayOf(__703034452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetValue(instance: IUnknown?): IUnknown? {
      val fnPtr = _703034452_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__703034452_Ptr, marshalToNative(instance), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun SetValue(instance: IUnknown?, value: IUnknown?): Unit {
      val fnPtr = _703034452_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__703034452_Ptr, marshalToNative(instance),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlMember_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __703034452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlMember, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c541f58c43a94216b718e0b11b14e93e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlMember(ptr: Pointer?): WithDefault = IXamlMember_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlMember {
      val address = segment.toRawLongValue()
      return makeIXamlMember(Pointer(address))
    }

    public override fun toNative(obj: IXamlMember): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__703034452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlMember): Array<IXamlMember?> = (elements as
        Array<IXamlMember?>).castToImpl<IXamlMember,IXamlMember_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlMember?> =
        arrayOfNulls<IXamlMember_Impl>(size) as Array<IXamlMember?>
  }
}
