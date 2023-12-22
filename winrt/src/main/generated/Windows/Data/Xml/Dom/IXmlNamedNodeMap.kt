package Windows.Data.Xml.Dom

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IXmlNamedNodeMap.ABI::class)
@Guid("b3a69eb0aab04b82a6fab1453f7c021b")
@WinRTByReference(IXmlNamedNodeMap.ByReference::class)
@TypeHash("__655640289_Type")
public interface IXmlNamedNodeMap : NativeMapped, IWinRTInterface, IVectorView<IXmlNode?>,
    IIterable<IXmlNode?> {
  public val __655640289_Ptr: Pointer?

  public val _655640289_VtblPtr: Pointer?
    get() = __655640289_Ptr?.getPointer(0)

  public override val __970637876_Type: KType
    get() = IVectorView::class.createType(listOf(
      KTypeProjection(INVARIANT,IXmlNode::class.createType()),
    ))

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,IXmlNode::class.createType()),
    ))

  public fun get_Length(): WinDef.UINT

  public fun Item(index: WinDef.UINT): IXmlNode?

  public fun GetNamedItem(name: String?): IXmlNode?

  public fun SetNamedItem(node: IXmlNode?): IXmlNode?

  public fun RemoveNamedItem(name: String?): IXmlNode?

  public fun GetNamedItemNS(namespaceUri: IUnknown?, name: String?): IXmlNode?

  public fun RemoveNamedItemNS(namespaceUri: IUnknown?, name: String?): IXmlNode?

  public fun SetNamedItemNS(node: IXmlNode?): IXmlNode?

  public interface WithDefault : IXmlNamedNodeMap {
    public override fun get_Length(): WinDef.UINT {
      val fnPtr = _655640289_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__655640289_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = WinDef.UINT::class.createType()
      return marshalFromNative<WinDef.UINT>(result.getValue(), returnType!!)!!
    }

    public override fun Item(index: WinDef.UINT): IXmlNode? {
      val fnPtr = _655640289_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__655640289_Ptr,marshalToNative(index),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IXmlNode::class.createType()
      return marshalFromNative<IXmlNode>(result.getValue(), returnType!!)
    }

    public override fun GetNamedItem(name: String?): IXmlNode? {
      val fnPtr = _655640289_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__655640289_Ptr,marshalToNative(name),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IXmlNode::class.createType()
      return marshalFromNative<IXmlNode>(result.getValue(), returnType!!)
    }

    public override fun SetNamedItem(node: IXmlNode?): IXmlNode? {
      val fnPtr = _655640289_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__655640289_Ptr,marshalToNative(node),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IXmlNode::class.createType()
      return marshalFromNative<IXmlNode>(result.getValue(), returnType!!)
    }

    public override fun RemoveNamedItem(name: String?): IXmlNode? {
      val fnPtr = _655640289_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__655640289_Ptr,marshalToNative(name),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IXmlNode::class.createType()
      return marshalFromNative<IXmlNode>(result.getValue(), returnType!!)
    }

    public override fun GetNamedItemNS(namespaceUri: IUnknown?, name: String?): IXmlNode? {
      val fnPtr = _655640289_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__655640289_Ptr,marshalToNative(namespaceUri),
          marshalToNative(name),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IXmlNode::class.createType()
      return marshalFromNative<IXmlNode>(result.getValue(), returnType!!)
    }

    public override fun RemoveNamedItemNS(namespaceUri: IUnknown?, name: String?): IXmlNode? {
      val fnPtr = _655640289_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__655640289_Ptr,marshalToNative(namespaceUri),
          marshalToNative(name),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IXmlNode::class.createType()
      return marshalFromNative<IXmlNode>(result.getValue(), returnType!!)
    }

    public override fun SetNamedItemNS(node: IXmlNode?): IXmlNode? {
      val fnPtr = _655640289_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__655640289_Ptr,marshalToNative(node),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IXmlNode::class.createType()
      return marshalFromNative<IXmlNode>(result.getValue(), returnType!!)
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlNamedNodeMap> {
    public override fun getValue(): IXmlNamedNodeMap =
        ABI.makeIXmlNamedNodeMap(pointer.getPointer(0))

    public fun setValue(value: IXmlNamedNodeMap): Unit {
      pointer = value.__655640289_Ptr!!
    }
  }

  public class IXmlNamedNodeMapImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __655640289_Ptr: JNAPointer?
      get() = pointer

    public override val _655640289_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __970637876_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IVectorView<IXmlNode?>>())
      val result = PointerByReference()
      IUnknownVtbl(_655640289_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<IXmlNode?>>())
      val result = PointerByReference()
      IUnknownVtbl(_655640289_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): IXmlNamedNodeMap = IXmlNamedNodeMapImpl(ptr)
    }
  }

  public object ABI : IABI<IXmlNamedNodeMap, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlNamedNodeMap(ptr: JNAPointer?) = IXmlNamedNodeMapImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlNamedNodeMap {
      val address = segment.toRawLongValue()
      return makeIXmlNamedNodeMap(Pointer(address))
    }

    public override fun toNative(obj: IXmlNamedNodeMap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__655640289_Ptr))
  }
}
