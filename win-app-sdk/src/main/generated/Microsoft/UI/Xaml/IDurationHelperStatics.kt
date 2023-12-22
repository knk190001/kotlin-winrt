package Microsoft.UI.Xaml

import Windows.Foundation.TimeSpan
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDurationHelperStatics.ABI::class)
@Signature("{491feb2c-3475-5f89-b15c-49c236eb514c}")
@Guid("491feb2c34755f89b15c49c236eb514c")
@WinRTInterface("491feb2c34755f89b15c49c236eb514c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDurationHelperStatics.ByReference::class)
public interface IDurationHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Automatic(): Duration?

  @InterfaceMethod(1)
  public fun get_Forever(): Duration?

  @InterfaceMethod(2)
  public fun Compare(duration1: Duration?, duration2: Duration?): Int

  @InterfaceMethod(3)
  public fun FromTimeSpan(timeSpan: TimeSpan?): Duration?

  @InterfaceMethod(4)
  public fun GetHasTimeSpan(target: Duration?): Boolean

  @InterfaceMethod(5)
  public fun Add(target: Duration?, duration: Duration?): Duration?

  @InterfaceMethod(6)
  public fun Equals(target: Duration?, value: Duration?): Boolean

  @InterfaceMethod(7)
  public fun Subtract(target: Duration?, duration: Duration?): Duration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDurationHelperStatics> {
    public override fun getValue() = ABI.makeIDurationHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IDurationHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDurationHelperStatics {
    public val __1948239132_Ptr: Pointer?

    public val _1948239132_VtblPtr: Pointer?
      get() = __1948239132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Automatic(): Duration? {
      val fnPtr = _1948239132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Duration>()
      val hr = fn.invokeHR(arrayOf(__1948239132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Duration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Forever(): Duration? {
      val fnPtr = _1948239132_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Duration>()
      val hr = fn.invokeHR(arrayOf(__1948239132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Duration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Compare(duration1: Duration?, duration2: Duration?): Int {
      val fnPtr = _1948239132_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1948239132_Ptr, marshalToNative(duration1),
          marshalToNative(duration2), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun FromTimeSpan(timeSpan: TimeSpan?): Duration? {
      val fnPtr = _1948239132_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Duration>()
      val hr = fn.invokeHR(arrayOf(__1948239132_Ptr, marshalToNative(timeSpan), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Duration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetHasTimeSpan(target: Duration?): Boolean {
      val fnPtr = _1948239132_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1948239132_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun Add(target: Duration?, duration: Duration?): Duration? {
      val fnPtr = _1948239132_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Duration>()
      val hr = fn.invokeHR(arrayOf(__1948239132_Ptr, marshalToNative(target),
          marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Duration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun Equals(target: Duration?, value: Duration?): Boolean {
      val fnPtr = _1948239132_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1948239132_Ptr, marshalToNative(target),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun Subtract(target: Duration?, duration: Duration?): Duration? {
      val fnPtr = _1948239132_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Duration>()
      val hr = fn.invokeHR(arrayOf(__1948239132_Ptr, marshalToNative(target),
          marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Duration>(result.getValue())
      return resultValue
    }
  }

  public class IDurationHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1948239132_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDurationHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("491feb2c34755f89b15c49c236eb514c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDurationHelperStatics(ptr: Pointer?): WithDefault =
        IDurationHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDurationHelperStatics {
      val address = segment.toRawLongValue()
      return makeIDurationHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IDurationHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1948239132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDurationHelperStatics): Array<IDurationHelperStatics?> =
        (elements as
        Array<IDurationHelperStatics?>).castToImpl<IDurationHelperStatics,IDurationHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDurationHelperStatics?> =
        arrayOfNulls<IDurationHelperStatics_Impl>(size) as Array<IDurationHelperStatics?>
  }
}
