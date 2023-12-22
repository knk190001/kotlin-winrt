package Windows.Networking.Vpn

import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
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
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IVpnPacketBufferList.ABI::class)
@Guid("c2f891fc4d5c4a63b70d4e307eacce77")
@WinRTByReference(IVpnPacketBufferList.ByReference::class)
@TypeHash("__117039338_Type")
public interface IVpnPacketBufferList : NativeMapped, IWinRTInterface, IIterable<VpnPacketBuffer?> {
  public val __117039338_Ptr: Pointer?

  public val _117039338_VtblPtr: Pointer?
    get() = __117039338_Ptr?.getPointer(0)

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,VpnPacketBuffer::class.createType()),
    ))

  public fun Append(nextVpnPacketBuffer: VpnPacketBuffer?): Unit

  public fun AddAtBegin(nextVpnPacketBuffer: VpnPacketBuffer?): Unit

  public fun RemoveAtEnd(): VpnPacketBuffer?

  public fun RemoveAtBegin(): VpnPacketBuffer?

  public fun Clear(): Unit

  public fun put_Status(value: VpnPacketBufferStatus?): Unit

  public fun get_Status(): VpnPacketBufferStatus?

  public fun get_Size(): WinDef.UINT

  public interface WithDefault : IVpnPacketBufferList {
    public override fun Append(nextVpnPacketBuffer: VpnPacketBuffer?): Unit {
      val fnPtr = _117039338_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__117039338_Ptr,marshalToNative(nextVpnPacketBuffer)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun AddAtBegin(nextVpnPacketBuffer: VpnPacketBuffer?): Unit {
      val fnPtr = _117039338_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__117039338_Ptr,marshalToNative(nextVpnPacketBuffer)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun RemoveAtEnd(): VpnPacketBuffer? {
      val fnPtr = _117039338_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<VpnPacketBuffer>()
      val hr = fn.invokeHR(arrayOf(__117039338_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = VpnPacketBuffer::class.createType()
      return marshalFromNative<VpnPacketBuffer>(result.getValue(), returnType!!)
    }

    public override fun RemoveAtBegin(): VpnPacketBuffer? {
      val fnPtr = _117039338_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<VpnPacketBuffer>()
      val hr = fn.invokeHR(arrayOf(__117039338_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = VpnPacketBuffer::class.createType()
      return marshalFromNative<VpnPacketBuffer>(result.getValue(), returnType!!)
    }

    public override fun Clear(): Unit {
      val fnPtr = _117039338_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__117039338_Ptr,))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun put_Status(value: VpnPacketBufferStatus?): Unit {
      val fnPtr = _117039338_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__117039338_Ptr,marshalToNative(value)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun get_Status(): VpnPacketBufferStatus? {
      val fnPtr = _117039338_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<VpnPacketBufferStatus>()
      val hr = fn.invokeHR(arrayOf(__117039338_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = VpnPacketBufferStatus::class.createType()
      return marshalFromNative<VpnPacketBufferStatus>(result.getValue(), returnType!!)
    }

    public override fun get_Size(): WinDef.UINT {
      val fnPtr = _117039338_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__117039338_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = WinDef.UINT::class.createType()
      return marshalFromNative<WinDef.UINT>(result.getValue(), returnType!!)!!
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnPacketBufferList> {
    public override fun getValue(): IVpnPacketBufferList =
        ABI.makeIVpnPacketBufferList(pointer.getPointer(0))

    public fun setValue(value: IVpnPacketBufferList): Unit {
      pointer = value.__117039338_Ptr!!
    }
  }

  public class IVpnPacketBufferListImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __117039338_Ptr: JNAPointer?
      get() = pointer

    public override val _117039338_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<VpnPacketBuffer?>>())
      val result = PointerByReference()
      IUnknownVtbl(_117039338_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): IVpnPacketBufferList =
          IVpnPacketBufferListImpl(ptr)
    }
  }

  public object ABI : IABI<IVpnPacketBufferList, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnPacketBufferList(ptr: JNAPointer?) = IVpnPacketBufferListImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnPacketBufferList {
      val address = segment.toRawLongValue()
      return makeIVpnPacketBufferList(Pointer(address))
    }

    public override fun toNative(obj: IVpnPacketBufferList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__117039338_Ptr))
  }
}
