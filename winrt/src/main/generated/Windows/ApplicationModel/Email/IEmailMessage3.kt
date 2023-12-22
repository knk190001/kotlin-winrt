package Windows.ApplicationModel.Email

import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IEmailMessage3.ABI::class)
@Signature("{a1ea675c-e598-4d29-a018-fc7b7eece0a1}")
@Guid("a1ea675ce5984d29a018fc7b7eece0a1")
@WinRTInterface("a1ea675ce5984d29a018fc7b7eece0a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMessage3.ByReference::class)
public interface IEmailMessage3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SmimeData(): IRandomAccessStreamReference?

  @InterfaceMethod(1)
  public fun put_SmimeData(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(2)
  public fun get_SmimeKind(): EmailMessageSmimeKind?

  @InterfaceMethod(3)
  public fun put_SmimeKind(value: EmailMessageSmimeKind?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailMessage3>
      {
    public override fun getValue() = ABI.makeIEmailMessage3(pointer.getPointer(0))

    public fun setValue(value: IEmailMessage3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMessage3 {
    public val __1269602159_Ptr: Pointer?

    public val _1269602159_VtblPtr: Pointer?
      get() = __1269602159_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SmimeData(): IRandomAccessStreamReference? {
      val fnPtr = _1269602159_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1269602159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SmimeData(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _1269602159_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602159_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SmimeKind(): EmailMessageSmimeKind? {
      val fnPtr = _1269602159_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageSmimeKind>()
      val hr = fn.invokeHR(arrayOf(__1269602159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageSmimeKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SmimeKind(value: EmailMessageSmimeKind?): Unit {
      val fnPtr = _1269602159_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602159_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailMessage3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1269602159_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMessage3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1ea675ce5984d29a018fc7b7eece0a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMessage3(ptr: Pointer?): WithDefault = IEmailMessage3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMessage3 {
      val address = segment.toRawLongValue()
      return makeIEmailMessage3(Pointer(address))
    }

    public override fun toNative(obj: IEmailMessage3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1269602159_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMessage3): Array<IEmailMessage3?> = (elements as
        Array<IEmailMessage3?>).castToImpl<IEmailMessage3,IEmailMessage3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMessage3?> =
        arrayOfNulls<IEmailMessage3_Impl>(size) as Array<IEmailMessage3?>
  }
}
