package Windows.ApplicationModel.Calls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneLine2.ABI::class)
@Signature("{0167f56a-5344-5d64-8af3-a31a950e916a}")
@Guid("0167f56a53445d648af3a31a950e916a")
@WinRTInterface("0167f56a53445d648af3a31a950e916a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLine2.ByReference::class)
public interface IPhoneLine2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun EnableTextReply(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_TransportDeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPhoneLine2> {
    public override fun getValue() = ABI.makeIPhoneLine2(pointer.getPointer(0))

    public fun setValue(value: IPhoneLine2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLine2 {
    public val __2045801746_Ptr: Pointer?

    public val _2045801746_VtblPtr: Pointer?
      get() = __2045801746_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun EnableTextReply(value: Boolean): Unit {
      val fnPtr = _2045801746_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2045801746_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_TransportDeviceId(): String? {
      val fnPtr = _2045801746_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2045801746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneLine2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2045801746_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLine2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0167f56a53445d648af3a31a950e916a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLine2(ptr: Pointer?): WithDefault = IPhoneLine2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLine2 {
      val address = segment.toRawLongValue()
      return makeIPhoneLine2(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLine2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2045801746_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLine2): Array<IPhoneLine2?> = (elements as
        Array<IPhoneLine2?>).castToImpl<IPhoneLine2,IPhoneLine2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLine2?> =
        arrayOfNulls<IPhoneLine2_Impl>(size) as Array<IPhoneLine2?>
  }
}
