package Microsoft.UI.Input

import Windows.System.VirtualKey
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IKeyEventArgs.ABI::class)
@Signature("{40d5bb74-977e-5194-8039-9f6c44427bbb}")
@Guid("40d5bb74977e519480399f6c44427bbb")
@WinRTInterface("40d5bb74977e519480399f6c44427bbb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyEventArgs.ByReference::class)
public interface IKeyEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_KeyStatus(): PhysicalKeyStatus?

  @InterfaceMethod(3)
  public fun get_Timestamp(): WinDef.ULONG

  @InterfaceMethod(4)
  public fun get_VirtualKey(): VirtualKey?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IKeyEventArgs>
      {
    public override fun getValue() = ABI.makeIKeyEventArgs(pointer.getPointer(0))

    public fun setValue(value: IKeyEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyEventArgs {
    public val __301497615_Ptr: Pointer?

    public val _301497615_VtblPtr: Pointer?
      get() = __301497615_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _301497615_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__301497615_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _301497615_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__301497615_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_KeyStatus(): PhysicalKeyStatus? {
      val fnPtr = _301497615_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhysicalKeyStatus>()
      val hr = fn.invokeHR(arrayOf(__301497615_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhysicalKeyStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Timestamp(): WinDef.ULONG {
      val fnPtr = _301497615_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__301497615_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_VirtualKey(): VirtualKey? {
      val fnPtr = _301497615_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__301497615_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }
  }

  public class IKeyEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __301497615_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40d5bb74977e519480399f6c44427bbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyEventArgs(ptr: Pointer?): WithDefault = IKeyEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyEventArgs {
      val address = segment.toRawLongValue()
      return makeIKeyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IKeyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__301497615_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyEventArgs): Array<IKeyEventArgs?> = (elements as
        Array<IKeyEventArgs?>).castToImpl<IKeyEventArgs,IKeyEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyEventArgs?> =
        arrayOfNulls<IKeyEventArgs_Impl>(size) as Array<IKeyEventArgs?>
  }
}
