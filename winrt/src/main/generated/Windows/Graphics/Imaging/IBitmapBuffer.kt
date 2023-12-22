package Windows.Graphics.Imaging

import Windows.Foundation.IClosable
import Windows.Foundation.IMemoryBuffer
import Windows.Foundation.IMemoryBuffer.ABI.IID
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

@ABIMarker(IBitmapBuffer.ABI::class)
@Signature("{a53e04c4-399c-438c-b28f-a63a6b83d1a1}")
@Guid("a53e04c4399c438cb28fa63a6b83d1a1")
@WinRTInterface("a53e04c4399c438cb28fa63a6b83d1a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapBuffer.ByReference::class)
public interface IBitmapBuffer : NativeMapped, IWinRTInterface, IMemoryBuffer, IClosable {
  @InterfaceMethod(0)
  public fun GetPlaneCount(): Int

  @InterfaceMethod(1)
  public fun GetPlaneDescription(index: Int): BitmapPlaneDescription?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapBuffer>
      {
    public override fun getValue() = ABI.makeIBitmapBuffer(pointer.getPointer(0))

    public fun setValue(value: IBitmapBuffer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapBuffer, IMemoryBuffer.WithDefault, IClosable.WithDefault {
    public val __411909608_Ptr: Pointer?

    public val _411909608_VtblPtr: Pointer?
      get() = __411909608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPlaneCount(): Int {
      val fnPtr = _411909608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__411909608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetPlaneDescription(index: Int): BitmapPlaneDescription? {
      val fnPtr = _411909608_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapPlaneDescription>()
      val hr = fn.invokeHR(arrayOf(__411909608_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapPlaneDescription>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapBuffer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMemoryBuffer, IClosable {
    public override val __2070864652_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_411909608_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_411909608_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __411909608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapBuffer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a53e04c4399c438cb28fa63a6b83d1a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapBuffer(ptr: Pointer?): WithDefault = IBitmapBuffer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapBuffer {
      val address = segment.toRawLongValue()
      return makeIBitmapBuffer(Pointer(address))
    }

    public override fun toNative(obj: IBitmapBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__411909608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapBuffer): Array<IBitmapBuffer?> = (elements as
        Array<IBitmapBuffer?>).castToImpl<IBitmapBuffer,IBitmapBuffer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapBuffer?> =
        arrayOfNulls<IBitmapBuffer_Impl>(size) as Array<IBitmapBuffer?>
  }
}
