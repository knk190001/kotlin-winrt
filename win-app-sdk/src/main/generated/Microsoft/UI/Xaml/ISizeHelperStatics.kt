package Microsoft.UI.Xaml

import Windows.Foundation.Size
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISizeHelperStatics.ABI::class)
@Signature("{cff1b27f-84f1-5b14-9459-764af5714fe5}")
@Guid("cff1b27f84f15b149459764af5714fe5")
@WinRTInterface("cff1b27f84f15b149459764af5714fe5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISizeHelperStatics.ByReference::class)
public interface ISizeHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Empty(): Size?

  @InterfaceMethod(1)
  public fun FromDimensions(width: Float, height: Float): Size?

  @InterfaceMethod(2)
  public fun GetIsEmpty(target: Size?): Boolean

  @InterfaceMethod(3)
  public fun Equals(target: Size?, value: Size?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISizeHelperStatics> {
    public override fun getValue() = ABI.makeISizeHelperStatics(pointer.getPointer(0))

    public fun setValue(value: ISizeHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISizeHelperStatics {
    public val __2114109361_Ptr: Pointer?

    public val _2114109361_VtblPtr: Pointer?
      get() = __2114109361_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Empty(): Size? {
      val fnPtr = _2114109361_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__2114109361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromDimensions(width: Float, height: Float): Size? {
      val fnPtr = _2114109361_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__2114109361_Ptr, width, height, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetIsEmpty(target: Size?): Boolean {
      val fnPtr = _2114109361_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2114109361_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun Equals(target: Size?, value: Size?): Boolean {
      val fnPtr = _2114109361_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2114109361_Ptr, marshalToNative(target),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISizeHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2114109361_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISizeHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cff1b27f84f15b149459764af5714fe5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISizeHelperStatics(ptr: Pointer?): WithDefault = ISizeHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISizeHelperStatics {
      val address = segment.toRawLongValue()
      return makeISizeHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: ISizeHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2114109361_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISizeHelperStatics): Array<ISizeHelperStatics?> =
        (elements as
        Array<ISizeHelperStatics?>).castToImpl<ISizeHelperStatics,ISizeHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISizeHelperStatics?> =
        arrayOfNulls<ISizeHelperStatics_Impl>(size) as Array<ISizeHelperStatics?>
  }
}
