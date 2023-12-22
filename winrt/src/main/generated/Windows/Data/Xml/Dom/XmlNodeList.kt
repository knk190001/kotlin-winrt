package Windows.Data.Xml.Dom

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(XmlNodeList.ABI::class)
@Signature("rc(Windows.Data.Xml.Dom.XmlNodeList;{8c60ad77-83a4-4ec1-9c54-7ba429e13da6})")
@WinRTByReference(brClass = XmlNodeList.ByReference::class)
public class XmlNodeList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXmlNodeList.WithDefault, IVectorView<IXmlNode?>, IIterable<IXmlNode?>,
    IWinRTObject {
  private val __608636384_Interface: IXmlNodeList.WithDefault by lazy {
    as_608636384()
  }


  private val __970637876_Interface: IVectorView<IXmlNode?> by lazy {
    as_970637876()
  }


  private val __1449643190_Interface: IIterable<IXmlNode?> by lazy {
    as_1449643190()
  }


  public override val __970637876_Type: KType = typeOf<IVectorView<IXmlNode?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IXmlNode?>>()

  public override val __608636384_Ptr: JNAPointer? by lazy {
    __608636384_Interface.__608636384_Ptr
  }


  public override val __970637876_Ptr: JNAPointer? by lazy {
    __970637876_Interface.__970637876_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__608636384_Interface, __970637876_Interface, __1449643190_Interface)

  private fun as_608636384(): IXmlNodeList.WithDefault {
    if(pointer == NULL) {
      return(IXmlNodeList.ABI.makeIXmlNodeList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlNodeList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNodeList.ABI.makeIXmlNodeList(ref.value))
  }

  private fun as_970637876(): IVectorView<IXmlNode?> {
    if(pointer == NULL) {
      return(IVectorView.ABI.makeIVectorView<IXmlNode?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVectorView<IXmlNode?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVectorView.ABI.makeIVectorView<IXmlNode?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IXmlNode?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IXmlNode?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IXmlNode?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IXmlNode?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<XmlNodeList> {
    public override fun getValue() = XmlNodeList(pointer.getPointer(0))

    public fun setValue(value: XmlNodeList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XmlNodeList, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): XmlNodeList {
      val address = segment.toRawLongValue()
      return XmlNodeList(Pointer(address))
    }

    public override fun toNative(obj: XmlNodeList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
