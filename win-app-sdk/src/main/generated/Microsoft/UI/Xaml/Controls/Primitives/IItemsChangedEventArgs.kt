package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IItemsChangedEventArgs.ABI::class)
@Signature("{b2ba1610-0e96-538a-978f-ec0b37193228}")
@Guid("b2ba16100e96538a978fec0b37193228")
@WinRTInterface("b2ba16100e96538a978fec0b37193228")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsChangedEventArgs.ByReference::class)
public interface IItemsChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Action(): Int

  @InterfaceMethod(1)
  public fun get_Position(): GeneratorPosition?

  @InterfaceMethod(2)
  public fun get_OldPosition(): GeneratorPosition?

  @InterfaceMethod(3)
  public fun get_ItemCount(): Int

  @InterfaceMethod(4)
  public fun get_ItemUICount(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsChangedEventArgs> {
    public override fun getValue() = ABI.makeIItemsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IItemsChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsChangedEventArgs {
    public val __801969550_Ptr: Pointer?

    public val _801969550_VtblPtr: Pointer?
      get() = __801969550_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Action(): Int {
      val fnPtr = _801969550_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__801969550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Position(): GeneratorPosition? {
      val fnPtr = _801969550_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeneratorPosition>()
      val hr = fn.invokeHR(arrayOf(__801969550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeneratorPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OldPosition(): GeneratorPosition? {
      val fnPtr = _801969550_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeneratorPosition>()
      val hr = fn.invokeHR(arrayOf(__801969550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeneratorPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ItemCount(): Int {
      val fnPtr = _801969550_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__801969550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ItemUICount(): Int {
      val fnPtr = _801969550_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__801969550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IItemsChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __801969550_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2ba16100e96538a978fec0b37193228")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsChangedEventArgs(ptr: Pointer?): WithDefault =
        IItemsChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIItemsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IItemsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__801969550_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsChangedEventArgs): Array<IItemsChangedEventArgs?> =
        (elements as
        Array<IItemsChangedEventArgs?>).castToImpl<IItemsChangedEventArgs,IItemsChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsChangedEventArgs?> =
        arrayOfNulls<IItemsChangedEventArgs_Impl>(size) as Array<IItemsChangedEventArgs?>
  }
}
