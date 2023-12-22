package Windows.Media.PlayTo

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

@ABIMarker(IPlayToSource.ABI::class)
@Signature("{7f138a08-fbb7-4b09-8356-aa5f4e335c31}")
@Guid("7f138a08fbb74b098356aa5f4e335c31")
@WinRTInterface("7f138a08fbb74b098356aa5f4e335c31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayToSource.ByReference::class)
public interface IPlayToSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): PlayToConnection?

  @InterfaceMethod(1)
  public fun get_Next(): PlayToSource?

  @InterfaceMethod(2)
  public fun put_Next(value: PlayToSource?): Unit

  @InterfaceMethod(3)
  public fun PlayNext(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPlayToSource>
      {
    public override fun getValue() = ABI.makeIPlayToSource(pointer.getPointer(0))

    public fun setValue(value: IPlayToSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayToSource {
    public val __793257169_Ptr: Pointer?

    public val _793257169_VtblPtr: Pointer?
      get() = __793257169_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): PlayToConnection? {
      val fnPtr = _793257169_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToConnection>()
      val hr = fn.invokeHR(arrayOf(__793257169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToConnection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Next(): PlayToSource? {
      val fnPtr = _793257169_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToSource>()
      val hr = fn.invokeHR(arrayOf(__793257169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Next(value: PlayToSource?): Unit {
      val fnPtr = _793257169_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__793257169_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun PlayNext(): Unit {
      val fnPtr = _793257169_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__793257169_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayToSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __793257169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayToSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f138a08fbb74b098356aa5f4e335c31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayToSource(ptr: Pointer?): WithDefault = IPlayToSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayToSource {
      val address = segment.toRawLongValue()
      return makeIPlayToSource(Pointer(address))
    }

    public override fun toNative(obj: IPlayToSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__793257169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayToSource): Array<IPlayToSource?> = (elements as
        Array<IPlayToSource?>).castToImpl<IPlayToSource,IPlayToSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayToSource?> =
        arrayOfNulls<IPlayToSource_Impl>(size) as Array<IPlayToSource?>
  }
}
